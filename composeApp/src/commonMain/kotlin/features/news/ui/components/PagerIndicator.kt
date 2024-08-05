package features.news.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.LinearOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import theme.CosmosApp

@Composable
fun PagerIndicator(
    modifier: Modifier = Modifier,
    count: Int,
    currentIndex: Int,
    onRequestPage: (Int) -> Unit = {},
) {
    val activeColor = MaterialTheme.colors.onBackground
    val disabledColor = MaterialTheme.colors.onBackground.copy(alpha = 0.3f)
    Row(modifier = modifier) {
        repeat(count) {
            val targetColor = if (currentIndex == it) activeColor else disabledColor
            val colorAnimation = animateColorAsState(targetValue = targetColor, tween(500, easing = FastOutLinearInEasing)).value

            Box(
                modifier =
                    Modifier
                        .padding(2.dp)
                        .size(8.dp)
                        .clip(CircleShape)
                        .background(
                            color = colorAnimation,
                        ).clickable {
                            onRequestPage(it)
                        },
            )
        }
    }
}

@Composable
fun progressIndicators(
    count: Int,
    currentPage: Int,
    modifier: Modifier,
    enableAutoSwipe: Boolean = false,
    clearPreviousPage: Boolean = false,
    onFinishPageLoad: (Int) -> Unit,
    onSelectIndicator: (Int) -> Unit,
) {
    fun isCurrentPage(index: Int) = (currentPage == index)

    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier,
    ) {
        repeat(count) { index ->

            val delay = if (!isCurrentPage(index)) 500 else 10000
            val progressTarget =
                remember {
                    mutableStateOf(0f)
                }

            val animateProgress =
                animateFloatAsState(
                    targetValue = progressTarget.value,
                    animationSpec =
                        tween(
                            durationMillis = delay,
                            delayMillis = 500,
                            easing = LinearOutSlowInEasing,
                        ),
                )

            val weight = 1f / count

            progressTarget.value =
                if (isCurrentPage(index)) {
                    1f
                } else {
                    0f
                }

            LinearGradientProgress(
                progress = animateProgress.value,
                backgroundColor = MaterialTheme.colors.onBackground.copy(alpha = 0.5f),
                modifier =
                    Modifier
                        .padding(1.dp)
                        .clip(RoundedCornerShape(CosmosApp.Resources.defaultRadius))
                        .weight(weight)
                        .height(5.dp)
                        .clickable {
                            onSelectIndicator(index)
                        },
            )

            if (animateProgress.value == 1f && enableAutoSwipe) {
                onFinishPageLoad(index)
            }
        }
    }
}

@Composable
fun LinearGradientProgress(
    progress: Float,
    modifier: Modifier = Modifier,
    backgroundColor: Color = MaterialTheme.colors.onBackground.copy(alpha = 0.5f),
    gradientColors: List<Color> = CosmosApp.Colors.themeColors(),
) {
    val gradientBrush = Brush.horizontalGradient(colors = gradientColors)

    Canvas(modifier = modifier) {
        val width = size.width
        val height = size.height

        // Draw background
        drawRoundRect(
            color = backgroundColor,
            size = size,
            cornerRadius = CornerRadius(50f, 50f),
        )

        // Draw progress with gradient
        drawRoundRect(
            brush = gradientBrush,
            size = size.copy(width = width * progress),
            cornerRadius = CornerRadius(50f, 50f),
        )
    }
}
