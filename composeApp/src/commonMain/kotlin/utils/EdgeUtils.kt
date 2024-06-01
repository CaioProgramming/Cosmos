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
import androidx.compose.ui.graphics.CompositingStrategy
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp

@Composable
fun Modifier.blurryEdge() = blur(1.dp, 1.dp, edgeTreatment = BlurredEdgeTreatment.Rectangle)

@Composable
fun Modifier.fadingEdge(endColor: androidx.compose.ui.graphics.Color = MaterialTheme.colors.background): Modifier {
    val fadeColor = androidx.compose.ui.graphics.Color.Transparent
    return graphicsLayer {
        alpha = 0.99F
        compositingStrategy = CompositingStrategy.Offscreen
    }.drawWithContent {
        val colors = listOf(fadeColor, endColor)
        drawContent()
        drawRect(
            brush = Brush.linearGradient(colors, start = Offset(0f, 1000f), end = Offset(0f, 50f)),
            blendMode = BlendMode.DstIn,
        )
    }
}
