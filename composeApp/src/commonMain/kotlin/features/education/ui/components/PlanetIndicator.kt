package features.education.ui.components

import androidx.compose.animation.animateColorAsState
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.FastOutSlowInEasing
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.painterResource
import theme.Dimensions
import kotlin.math.PI
import kotlin.math.sin

@Composable
fun PlanetIndicator(
    modifier: Modifier = Modifier,
    icons: List<DrawableResource>,
    currentIndex: Int,
    arcRange: Float,
    onRequestPage: (Int) -> Unit = {},
) {
    val activeColor = MaterialTheme.colors.onBackground
    val disabledColor = MaterialTheme.colors.onBackground.copy(alpha = 0.3f)

    Row(modifier = modifier, horizontalArrangement = Arrangement.Center) {
        val count = icons.size
        print("\nIncluding $count icons in PlanetIndicator\n")

        repeat(count) {
            val icon = icons[it]
            val isSelected = currentIndex == it
            val targetColor = if (isSelected) activeColor else disabledColor
            val colorAnimation = animateColorAsState(targetValue = targetColor, tween(500, easing = FastOutLinearInEasing)).value

            val offsetAnimation = offsetAnimation(isSelected)
            val arcOffset = sin(it * (PI / (count - 1))).toFloat() * arcRange + offsetAnimation

            Image(
                painter = painterResource(icon),
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier =
                    Modifier
                        .padding(Dimensions.padding4)
                        .size(24.dp)
                        .graphicsLayer(translationY = arcOffset)
                        .clip(CircleShape)
                        .background(
                            Brush.radialGradient(
                                listOf(
                                    colorAnimation,
                                    Color.Transparent.toComposeColor(),
                                ),
                            ),
                            CircleShape,
                        ).clickable {
                            onRequestPage(it)
                        },
            )
        }
    }
}

@Composable
private fun offsetAnimation(isSelected: Boolean): Float {
    val itemOffset = 20f
    val offsetY = if (isSelected) itemOffset * -3 else itemOffset
    val offsetYAnimation by animateFloatAsState(
        targetValue = offsetY,
        animationSpec =
            tween(
                durationMillis = 1500,
                easing = FastOutSlowInEasing,
            ),
    )
    return offsetYAnimation
}
