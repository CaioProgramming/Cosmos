@file:OptIn(
    ExperimentalAnimationApi::class,
    ExperimentalFoundationApi::class,
    ExperimentalAnimationApi::class,
)

package features.education.ui

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.extension.LightSteelBlue
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.ic_compass
import com.ilustris.cosmos.resources.ic_const
import com.ilustris.cosmos.resources.ic_list
import com.ilustris.cosmos.resources.ic_ship
import com.ilustris.cosmos.resources.ic_stars
import features.education.data.model.Constellation
import features.education.ui.components.DetailCard
import org.jetbrains.compose.resources.painterResource
import theme.Dimensions
import utils.adjustLuminance
import utils.glow
import utils.pagerFadeTransition
import kotlin.random.Random

@Composable
private fun tint() =
    com.chrynan.colors.Color.LightSteelBlue
        .toComposeColor()

@Composable
fun StarryBackground(
    count: Int,
    modifier: Modifier,
) {
    val offsets =
        remember {
            mutableStateOf(emptyList<Offset>())
        }
    val infiniteTransition = rememberInfiniteTransition()
    val starAnimation =
        infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = offsets.value.size.toFloat(),
            animationSpec =
                infiniteRepeatable(
                    animation = tween(5000, easing = EaseIn),
                    repeatMode = RepeatMode.Reverse,
                ),
        )

    Box(modifier) {
        offsets.value.forEachIndexed { index, offset ->
            val glowAnimation =
                animateFloatAsState(
                    targetValue = if (index <= starAnimation.value) 20f else 5f,
                    animationSpec = tween(2000),
                ).value
            val alphaAnimation =
                animateFloatAsState(
                    targetValue = if (index <= starAnimation.value) 0.9f else 0.3f,
                    animationSpec = tween(2000),
                ).value
            Image(
                painterResource(Res.drawable.ic_const),
                contentDescription = null,
                modifier =
                    Modifier
                        .size(12.dp)
                        .graphicsLayer {
                            translationX = offset.x
                            translationY = offset.y
                            alpha = alphaAnimation
                        }.glow(Color.White, glowAnimation),
                contentScale = ContentScale.Fit,
                colorFilter = ColorFilter.tint(Color.White),
            )
        }
    }

    LaunchedEffect(Unit) {
        print("is offsets empty ${offsets.value.isEmpty()}\n\n${offsets.value.joinToString { "x: ${it.x} y: ${it.y}\n" }}")
        if (offsets.value.isEmpty()) {
            val offsetList =
                List(count * 3) {
                    Offset(
                        x = Random.nextDouble(-100.00, 1000.00).toFloat(),
                        y = Random.nextDouble(-100.00, 1000.00).toFloat(),
                    )
                }
            print("Adding offsets $offsetList\n")
            offsets.value = offsetList
        }
    }
}

@Composable
fun ConstellationsView(constellations: List<Constellation>) {
    val pagerState = rememberPagerState { constellations.size }
    val currentConstellation = constellations[pagerState.currentPage]
    val background =
        Brush.verticalGradient(
            listOf(
                MaterialTheme.colors.background,
                tint().adjustLuminance(0.2f),
                Color.Transparent,
            ),
        )
    Box(modifier = Modifier.background(background).fillMaxWidth()) {
        StarryBackground(
            constellations.size,
            modifier =
                Modifier
                    .padding(Dimensions.padding16)
                    .fillMaxWidth()
                    .height(250.dp)
                    .align(Alignment.TopCenter),
        )
        Column {
            VerticalPager(
                pagerState,
                modifier = Modifier.fillMaxWidth().height(200.dp),
            ) {
                val constellation = constellations[it]
                ConstellationView(
                    constellation,
                    modifier = Modifier.fillMaxSize().pagerFadeTransition(pagerState),
                )
            }

            ConstellationInfo(
                currentConstellation,
                constellations.maxOf { it.distance },
            )
        }
    }
}

@Composable
fun ConstellationView(
    constellation: Constellation,
    modifier: Modifier = Modifier,
) {
    Image(
        painterResource(constellation.icon.resource),
        contentDescription = constellation.name,
        modifier = modifier,
        contentScale = ContentScale.Fit,
    )
}

@Composable
fun ConstellationInfo(
    constellation: Constellation,
    maxDistance: Float,
) {
    val progress = (constellation.distance / maxDistance) * 100
    val progressAnimation = animateFloatAsState(targetValue = progress)
    LazyVerticalGrid(
        GridCells.Fixed(2),
        modifier =
            Modifier
                .fillMaxWidth()
                .padding(vertical = Dimensions.padding16)
                .background(
                    brush =
                        Brush.verticalGradient(
                            listOf(
                                Color.Transparent,
                                MaterialTheme.colors.surface.copy(alpha = 0.6f),
                                Color.Transparent,
                            ),
                        ),
                ).padding(Dimensions.padding16),
    ) {
        item(span = { GridItemSpan(this.maxLineSpan) }) {
            AnimatedContent(targetState = constellation.icon, transitionSpec = {
                slideInVertically(tween(500)) + fadeIn(tween(1000)) with slideOutVertically() +
                    fadeOut(
                        tween(500),
                    )
            }) {
                Text(
                    text = constellation.name,
                    style = MaterialTheme.typography.h4,
                    fontWeight = FontWeight.Black,
                    modifier = Modifier.padding(vertical = Dimensions.padding8),
                    color = Color.White,
                )
            }
        }
        item(span = { GridItemSpan(this.maxLineSpan) }) {
            AnimatedContent(targetState = constellation.description, transitionSpec = {
                slideInVertically(tween(500)) + fadeIn(tween(1000)) with slideOutVertically() +
                    fadeOut(
                        tween(500),
                    )
            }) {
                Text(
                    text = constellation.description,
                    color = Color.White,
                )
            }
        }

        item(span = { GridItemSpan(this.maxLineSpan) }) {
            DetailCard(
                title = "Distância da terra",
                counting = constellation.distance,
                suffix = "anos-luz",
                tint = tint(),
                progress = progressAnimation.value,
                iconVector = Res.drawable.ic_ship,
            )
        }
        item {
            DetailCard(
                title = "Vísivel em",
                value = constellation.location,
                tint = tint(),
                iconVector = Res.drawable.ic_compass,
            )
        }

        item {
            DetailCard(
                title = "Magnitude aparente",
                counting = constellation.magnitude,
                tint = tint(),
                iconVector = Res.drawable.ic_stars,
            )
        }

        item(span = { GridItemSpan(this.maxLineSpan) }) {
            AnimatedVisibility(visible = constellation.nickNames.isNotEmpty(), enter = slideInVertically(), exit = fadeOut()) {
                DetailCard(
                    title = "Nomes Alternativos",
                    value = constellation.nickNames.joinToString(),
                    tint = tint(),
                    iconVector = Res.drawable.ic_list,
                )
            }
        }
    }
}
