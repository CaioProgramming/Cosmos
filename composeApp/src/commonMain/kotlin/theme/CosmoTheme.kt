package theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import com.chrynan.colors.extension.CornflowerBlue
import com.chrynan.colors.extension.MediumPurple
import com.chrynan.colors.extension.Purple
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.moon_24

import org.jetbrains.compose.resources.painterResource

private val DarkColorScheme =
    darkColors(
        primary = CosmoColors.primary,
        secondary = CosmoColors.secondary,
        background = Colors.DarkBackground,
        onPrimary = Colors.White,
        onSurface = Colors.White,
        onBackground = Colors.White,
    )

private val LightColorScheme =
    lightColors(
        secondary = CosmoColors.secondary,
        background = Colors.LightBackground,
        onPrimary = Colors.Black,
        onSurface = Colors.Black,
        onBackground = Colors.Black,
    )

@Composable
fun CosmosTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content:
        @Composable()
        () -> Unit,
) {
    return MaterialTheme(
        colors = getColorTheme(darkTheme),
        content = content,
    )
}

@Composable
fun CosmosIcon(modifier: Modifier = Modifier) =
    Image(
        painter = painterResource(Res.drawable.moon_24),
        contentDescription = null,
        modifier = modifier.fillMaxSize(0.4f),
    )

private fun getColorTheme(darkTheme: Boolean) = if (darkTheme) DarkColorScheme else LightColorScheme

@Composable
fun getAppColors(): List<androidx.compose.ui.graphics.Color> {
    val purple = Color.Companion.Purple.toComposeColor()
    val purpleMedium = Color.Companion.MediumPurple.toComposeColor()
    val blue = Color.Companion.CornflowerBlue.toComposeColor()
   val colors = listOf(
        MaterialTheme.colors.primary,
        blue,
        purpleMedium,
        MaterialTheme.colors.secondary,
        purple,
    )

    return colors
}
@Composable
fun getAppBrush(): Brush {
    val purple = Color.Companion.Purple.toComposeColor()
    val purpleMedium = Color.Companion.MediumPurple.toComposeColor()
    val blue = Color.Companion.CornflowerBlue.toComposeColor()
   val colors = listOf(
        MaterialTheme.colors.primary,
        blue,
        purpleMedium,
        MaterialTheme.colors.secondary,
        purple,
    )

    return Brush.linearGradient(colors)
}