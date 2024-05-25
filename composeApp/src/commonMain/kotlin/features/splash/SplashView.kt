package features.splash

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import animations.createGradientAnimation
import cosmos.composeapp.generated.resources.Res
import cosmos.composeapp.generated.resources.moon_24
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
fun SplashView() {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Image(
            painter = painterResource(Res.drawable.moon_24),
            contentDescription = null,
            modifier =
                Modifier.createGradientAnimation(
                    listOf(
                        MaterialTheme.colors.primary,
                        MaterialTheme.colors.secondary,
                    ),
                )
                    .size(200.dp),
            contentScale = ContentScale.FillBounds,
        )
    }
}

@Preview
@Composable
fun SplashPreview() {
    SplashView()
}
