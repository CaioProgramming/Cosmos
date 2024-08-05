package utils

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color

fun Modifier.glow(
    color: Color,
    radius: Float = Float.POSITIVE_INFINITY,
) = this.background(
    Brush.radialGradient(
        listOf(
            color,
            Color.Transparent,
        ),
        radius = radius,
    ),
    CircleShape,
)

@Composable
fun Modifier.fadeBackground(
    endColor: Color = MaterialTheme.colors.background,
    reversed: Boolean = false,
) = this.background(
    Brush.verticalGradient(
        if (reversed) {
            listOf(
                endColor,
                Color.Transparent,
            )
        } else {
            listOf(
                Color.Transparent,
                endColor,
            )
        },
    ),
)
