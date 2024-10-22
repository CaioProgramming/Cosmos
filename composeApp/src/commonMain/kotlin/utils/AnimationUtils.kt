package utils

import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.graphicsLayer

@Composable
fun Modifier.infiniteZoomAnimation(): Modifier {
    val infiniteAnimation = rememberInfiniteTransition()
    val zoomAnimation =
        infiniteAnimation.animateFloat(
            initialValue = 1f,
            targetValue = 1.4f,
            animationSpec =
                infiniteRepeatable(
                    animation = tween(30000, easing = EaseIn, delayMillis = 2000),
                    repeatMode = RepeatMode.Reverse,
                ),
        )
    return this.graphicsLayer {
        scaleX = zoomAnimation.value
        scaleY = zoomAnimation.value
    }
}
