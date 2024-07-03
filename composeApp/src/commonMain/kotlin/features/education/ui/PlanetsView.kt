@file:OptIn(ExperimentalFoundationApi::class)

package features.education.ui

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.tween
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.chrynan.colors.compose.toComposeColor
import features.education.data.model.PlanetData
import features.education.ui.components.PlanetIndicator
import features.education.ui.components.PlanetInfos
import features.education.ui.components.PlanetItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import theme.CosmosApp
import theme.Dimensions
import utils.glow
import utils.pagerCubeInScalingTransition
import kotlin.math.absoluteValue

@Composable
fun PlanetsView(
    planets: List<PlanetData>,
    onUpdateTitle: (String) -> Unit,
) {
    val coroutineScope: CoroutineScope = rememberCoroutineScope()
    val maxDistance = planets.maxOf { it.earthDistance }
    val maxSunDistance = planets.maxOf { it.sunDistance }
    val pagerState = rememberPagerState(pageCount = { planets.size })
    val currentPlanet = planets[pagerState.currentPage]
    val backgroundAlpha = 1f - pagerState.currentPageOffsetFraction.absoluteValue
    val planetColor =
        animateColorAsState(currentPlanet.planetColor.toComposeColor().copy(backgroundAlpha)).value
    val background =
        Brush.verticalGradient(
            listOf(
                MaterialTheme.colors.background,
                planetColor,
                Color.Transparent,
            ),
        )
    Column(modifier = Modifier.background(background).fillMaxWidth()) {
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
            },
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
                    .pagerCubeInScalingTransition(pagerState)
                    .rotate(rotationAnimation)
                    .clip(CircleShape)
                    .glow(planetColor, 5f),
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
                    brush =
                    Brush.verticalGradient(
                        listOf(
                            Color.Transparent,
                            MaterialTheme.colors.surface.copy(alpha = 0.5f),
                            Color.Transparent,
                        ),
                    ),
                ).padding(Dimensions.padding16),
        )
        onUpdateTitle(currentPlanet.title)
    }
}