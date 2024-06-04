package utils

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawWithContent
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun Modifier.blurryEdge() = blur(1.dp, 1.dp, edgeTreatment = BlurredEdgeTreatment.Rectangle)

@Composable
fun Modifier.fadingEdgeTop(endColor: Color = MaterialTheme.colors.background): Modifier {
    val fadeColor = Color.Transparent
    return graphicsLayer {
        alpha = 0.99F
        compositingStrategy = CompositingStrategy.Offscreen
    }.drawWithContent {
        val colors = listOf(fadeColor, endColor)
        drawContent()
        drawRect(
            brush = Brush.verticalGradient(0f to fadeColor, 0.3f to endColor),
            blendMode = BlendMode.DstIn,
        )
    }
}

@Composable
fun Modifier.fadingEdgeTopAndBottom(endColor: Color = MaterialTheme.colors.background): Modifier {
    val fadeColor = Color.Transparent
    return graphicsLayer {
        alpha = 0.99F
        compositingStrategy = CompositingStrategy.Offscreen
    }.drawWithContent {
        val colors = listOf(fadeColor, endColor)
        drawContent()
        val topBottomFade = Brush.verticalGradient(0f to fadeColor, 0.3f to endColor, 0.7f to fadeColor, 1f to endColor)

        drawRect(
            brush = topBottomFade,
            blendMode = BlendMode.DstIn,
        )
    }
}

@Composable
fun fadedGradient() = Brush.linearGradient(
    start = Offset(0f, 1000f), end = Offset(0f, 50f),
    colors = listOf(
        Color.Transparent,
        MaterialTheme.colors.background
    )
)
