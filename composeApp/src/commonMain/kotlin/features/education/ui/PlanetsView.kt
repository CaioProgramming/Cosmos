@file:OptIn(ExperimentalFoundationApi::class)

package features.education.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.chrynan.colors.compose.toComposeColor
import features.education.presentation.PlanetsState
import features.education.presentation.PlanetsViewModel
import features.education.ui.components.PlanetIndicator
import features.education.ui.components.PlanetInfos
import features.education.ui.components.PlanetItem
import kotlinx.coroutines.launch
import org.koin.compose.koinInject
import theme.Corners
import theme.CosmosApp
import theme.Dimensions
import utils.fadingEdgeTop
import utils.glow
import utils.pagerCubeInScalingTransition
import kotlin.math.PI
import kotlin.math.absoluteValue
import kotlin.math.cos
import kotlin.math.sin

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun PlanetsView(
    viewModel: PlanetsViewModel = koinInject(),
    navController: NavController = LocalNavController.current,
) {
    val state = viewModel.state.collectAsState().value
    val coroutineScope = rememberCoroutineScope()
    if (state == PlanetsState.Loading) {
        CosmosApp.Resources.animatedIcon()
    }

    LaunchedEffect(state) {
        if (state == null) {
            viewModel.getPlanets()
        }
    }

    if (state is PlanetsState.Success) {
        val planets = state.planets
        val maxDistance = planets.maxOf { it.earthDistance }
        val maxSunDistance = planets.maxOf { it.sunDistance }
        val pagerState = rememberPagerState(pageCount = { planets.size })
        val currentPlanet = planets[pagerState.currentPage]
        val backgroundAlpha = 1f - pagerState.currentPageOffsetFraction.absoluteValue
        val planetColor = animateColorAsState(currentPlanet.planetColor.toComposeColor().copy(backgroundAlpha)).value
        val background =
            Brush.verticalGradient(
                listOf(
                    MaterialTheme.colors.background,
                    planetColor,
                    Color.Transparent,
                ),
            )

        Box {
            Column(
                modifier =
                    Modifier
                        .background(background)
                        .displayCutoutPadding()
                        .fillMaxWidth(),
            ) {
                Column {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically,
                        modifier = Modifier.fillMaxWidth().padding(Dimensions.padding16),
                    ) {
                        Icon(
                            Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                            contentDescription = null,
                            modifier =
                                Modifier
                                    .size(24.dp)
                                    .clip(CircleShape)
                                    .clickable { navController.popBackStack() },
                        )

                        AnimatedContent(
                            targetState = currentPlanet,
                            transitionSpec = {
                                fadeIn(
                                    animationSpec = tween(500)) + slideInVertically(tween(1000)) with
                                        fadeOut(tween(800)) +
                                        slideOutVertically(animationSpec = tween(1000), targetOffsetY = { +it * 2 })
                            },
                        ) {
                            Text(
                                text = it.title,
                                style = MaterialTheme.typography.h5,
                                textAlign = TextAlign.Center,
                                modifier =
                                    Modifier
                                        .padding(
                                            Dimensions.padding16,
                                        ),
                            )
                        }

                        Box(modifier = Modifier.size(32.dp)) {}
                    }

                    PlanetIndicator(
                        icons = planets.map { it.planetVector.resource },
                        currentIndex = pagerState.currentPage,
                        arcRange = -100f,
                        modifier =
                            Modifier
                                .padding(Dimensions.padding16)
                                .fillMaxWidth()
                                .wrapContentHeight(align = Alignment.CenterVertically)
                                .align(Alignment.CenterHorizontally),
                        onRequestPage = {
                            coroutineScope.launch {
                                pagerState.animateScrollToPage(it)
                            }
                        }
                    )

                    HorizontalPager(pagerState) {
                        val targetRotation = if (pagerState.currentPage == it) 180f else 0f
                        val rotationAnimation by animateFloatAsState(
                            targetValue = targetRotation,
                            animationSpec =
                                infiniteRepeatable(
                                    animation =
                                        tween(
                                            durationMillis = 10000,
                                            easing = LinearEasing,
                                        ),
                                    repeatMode = RepeatMode.Reverse,
                                ),
                        )
                        val planet = planets[it]
                        PlanetItem(
                            planet.title,
                            planet.planetVector.resource,
                            Modifier
                                .align(Alignment.CenterHorizontally)
                                .fillMaxWidth()
                                .height(200.dp)
                                .pagerCubeInScalingTransition(it, pagerState)
                                .rotate(rotationAnimation)
                                .clip(CircleShape).glow(planetColor, 5f),
                        )
                    }

                    PlanetInfos(
                        currentPlanet.description,
                        currentPlanet.earthDistance,
                        currentPlanet.sunDistance,
                        currentPlanet.temperature,
                        currentPlanet.yearDuration,
                        currentPlanet.rotationSpeed,
                        maxDistance,
                        maxSunDistance,
                        planetColor,
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .padding(vertical = Dimensions.padding16)
                                .background(
                                   brush = Brush.verticalGradient(
                                       listOf(
                                           MaterialTheme.colors.surface.copy(alpha = 0.6f),
                                           MaterialTheme.colors.background
                                       )
                                   ),RoundedCornerShape(CosmosApp.Resources.defaultRadius),
                                ).padding(Dimensions.padding16),
                    )


                }
            }
            Text(
                "Ver constelações",
                style =
                MaterialTheme.typography.button.copy(
                    shadow =
                    Shadow(
                        color =
                        com.chrynan.colors.Color.White
                            .toComposeColor(),
                        offset = Offset(0f, 1f),
                        blurRadius = 3f,
                    ),
                ),
                modifier =
                Modifier
                    .background(MaterialTheme.colors.background)
                    .fillMaxWidth()
                    .padding(Dimensions.padding16)
                    .clickable { }
                    .clip(RoundedCornerShape(Corners.large))
                    .fadingEdgeTop()
                    .align(Alignment.BottomCenter),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
            )
        }
    }
}
