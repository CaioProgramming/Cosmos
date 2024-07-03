package utils

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.intl.Locale
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.convertHslComponentsToColor
import kotlin.math.max
import kotlin.math.min

fun Color.adjustLuminance(factor: Float): Color {
    val hsv = FloatArray(3)
    val argb = this.toArgb()
    val r = (argb shr 16 and 0xff) / 255f
    val g = (argb shr 8 and 0xff) / 255f
    val b = (argb and 0xff) / 255f
    val max = max(r, max(g, b))
    val min = min(r, min(g, b))
    val delta = max - min
    hsv[2] = max
    if (max != 0f) {
        hsv[1] = delta / max
    } else {
        hsv[1] = 0f
        hsv[0] = Float.NaN
        return this
    }
    if (r == max) {
        hsv[0] = (g - b) / delta
    } else if (g == max) {
        hsv[0] = 2 + (b - r) / delta
    } else {
        hsv[0] = 4 + (r - g) / delta
    }
    hsv[0] *= 60f
    if (hsv[0] < 0) hsv[0] += 360f
    hsv[2] *= factor
    hsv[2] = max(0f, min(hsv[2], 1f))
    return hsv.convertHslComponentsToColor().toComposeColor()
}