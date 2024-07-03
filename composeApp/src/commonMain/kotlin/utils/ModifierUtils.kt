package utils

import androidx.compose.foundation.background
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.BlurredEdgeTreatment
import androidx.compose.ui.draw.blur
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Paint
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.graphics.Shader
import androidx.compose.ui.graphics.drawscope.drawIntoCanvas
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.chrynan.colors.compose.toComposeColor
import org.jetbrains.skia.Point

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
