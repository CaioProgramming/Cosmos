package theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color


private val DarkColorScheme = darkColors(
    primary = CosmoColors.primary,
    secondary = CosmoColors.secondary,
    background = Colors.DarkBackground,
    onPrimary = Colors.White,
    onSurface = Colors.White,
    onBackground = Colors.White
)

private val LightColorScheme = lightColors(
    secondary = CosmoColors.secondary,
    background = Colors.LightBackground,
    onPrimary = Colors.Black,
    onSurface = Colors.Black,
    onBackground = Colors.Black
)

@Composable
fun CosmosTheme( darkTheme: Boolean = isSystemInDarkTheme(),
                    content: @Composable() () -> Unit) {


    return MaterialTheme(
        colors = getColorTheme(darkTheme),
        content = content
    )

}

private fun getColorTheme(darkTheme: Boolean) = if (darkTheme) DarkColorScheme else LightColorScheme