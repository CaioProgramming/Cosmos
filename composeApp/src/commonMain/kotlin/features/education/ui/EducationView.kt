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
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.VerticalPager
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
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.extension.MidnightBlue
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.ic_calendar
import com.ilustris.cosmos.resources.ic_const
import com.ilustris.cosmos.resources.ic_earth
import com.ilustris.cosmos.resources.ic_four_star
import com.ilustris.cosmos.resources.ic_orbit
import features.education.data.model.Constellation
import features.education.data.model.PlanetData
import features.education.presentation.PlanetsState
import features.education.presentation.PlanetsViewModel
import features.education.ui.components.PlanetIndicator
import features.education.ui.components.PlanetInfos
import features.education.ui.components.PlanetItem
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import org.jetbrains.compose.resources.painterResource
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions
import utils.glow
import utils.pagerCubeInScalingTransition
import kotlin.math.absoluteValue

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun EducationView(
    viewModel: PlanetsViewModel = koinInject(),
    navController: NavController = LocalNavController.current,
) {
    var currentPage by remember {
        mutableStateOf(EducationView.Planets)
    }
    var title by remember {
        mutableStateOf("")
    }
    val state = viewModel.state.collectAsState().value
    if (state == PlanetsState.Loading) {
        CosmosApp.Resources.animatedIcon()
    }

    LaunchedEffect(state) {
        if (state == null) {
            viewModel.getPlanets()
        }
    }

    if (state is PlanetsState.Success) {
        Column {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier =
                    Modifier
                        .displayCutoutPadding()
                        .fillMaxWidth()
                        .padding(Dimensions.padding16),
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
                    targetState = title,
                    transitionSpec = {
                        fadeIn(
                            animationSpec = tween(500),
                        ) + slideInVertically(tween(1000)) with
                            fadeOut(tween(800)) +
                            slideOutVertically(
                                animationSpec = tween(1000),
                                targetOffsetY = { +it * 2 },
                            )
                    },
                ) {
                    Text(
                        text = it,
                        style = MaterialTheme.typography.h5,
                        textAlign = TextAlign.Center,
                        modifier =
                            Modifier
                                .padding(
                                    Dimensions.padding16,
                                ),
                    )
                }

                AnimatedContent(currentPage, transitionSpec = {
                    scaleIn() with scaleOut()
                }) { educationView ->
                    val icon =
                        if (educationView == EducationView.Planets) {
                            Res.drawable.ic_const
                        } else {
                            Res.drawable.ic_orbit
                        }
                    Image(
                        painterResource(icon),
                        contentDescription = null,
                        colorFilter = ColorFilter.tint(Color.White),
                        modifier =
                            Modifier
                                .size(24.dp)
                                .clip(CircleShape)
                                .clickable {
                                    currentPage =
                                        if (currentPage == EducationView.Planets) {
                                            EducationView.Constellations
                                        } else {
                                            EducationView.Planets
                                        }
                                },
                    )
                }
            }

            AnimatedContent(
                currentPage,
                transitionSpec = { fadeIn(tween(1500)) with fadeOut(tween(500)) },
            ) {
                if (it == EducationView.Planets) {
                    PlanetsView(state.planets) { newTitle -> title = newTitle }
                } else {
                    ConstellationsView(state.constellations.sortedBy { it.distance })
                    title = "Constelações"
                }
            }
        }
    }
}





enum class EducationView {
    Planets,
    Constellations,
}
