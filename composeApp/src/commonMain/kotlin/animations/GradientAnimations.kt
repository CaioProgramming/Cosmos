package animations

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import theme.CosmosApp

@Composable
fun Modifier.createGradientAnimation(colors: List<Color> = CosmosApp.Colors.themeColors(), gradientType: GradientType = GradientType.LINEAR): Modifier {
    val infiniteTransition = rememberInfiniteTransition()
    val offsetAnimation =
        infiniteTransition.animateFloat(
            initialValue = 0f,
            targetValue = 100f,
            animationSpec =
                infiniteRepeatable(
                    tween(1500, easing = LinearEasing),
                    repeatMode = RepeatMode.Reverse,
                ),
        )


    val gradient = when (gradientType) {
        GradientType.LINEAR -> Brush.linearGradient(
            colors,
            start = Offset(offsetAnimation.value, offsetAnimation.value)
        )
        GradientType.RADIAL -> Brush.radialGradient(
            colors,
            center = Offset(offsetAnimation.value, offsetAnimation.value)
        )
        GradientType.SWEEP -> Brush.sweepGradient(
            colors
        )
    }

    return Modifier
        .graphicsLayer(alpha = 0.99f)
        .drawWithCache {
            onDrawWithContent {
                drawContent()
                drawRect(gradient, blendMode = BlendMode.SrcAtop)
            }
        }
}

fun Modifier.createGradientBackground(colors: List<Color>, gradientType: GradientType = GradientType.LINEAR): Modifier {
    val gradient = when (gradientType) {
        GradientType.LINEAR -> Brush.linearGradient(
            colors
        )
        GradientType.RADIAL -> Brush.radialGradient(
            colors
        )
        GradientType.SWEEP -> Brush.sweepGradient(
            colors
        )
    }

    return Modifier.background(gradient)
}


enum class GradientType {
    LINEAR,
    RADIAL,
    SWEEP
}

