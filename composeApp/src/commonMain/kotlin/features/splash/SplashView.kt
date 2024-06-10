package features.splash

import LocalNavController
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import animations.createGradientAnimation
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import features.home.ui.HomePage
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.CosmosApp

object SplashPage {
    val tag = "SplashPage"
}
@Composable
fun SplashView(navController: NavController = LocalNavController.current) {

    fun navigateToLogin() {
        navController.navigate(HomePage.tag)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Row(verticalAlignment = Alignment.CenterVertically) {
            CosmosApp.Resources.largeIcon(modifier = Modifier.createGradientAnimation(CosmosApp.Colors.themeColors()).clickable {
                navigateToLogin()
            })

            Text(
                text = "osmos",
                style = MaterialTheme.typography.h4.copy(fontFamily = CosmosApp.Typo.headFontFamily()),
                color = Color.White.toComposeColor())
        }

    }

    LaunchedEffect(Unit) {
        coroutineScope {
            delay(2000)
            navigateToLogin()
        }
    }



    @Preview
    @Composable
    fun SplashPreview() {
        SplashView(navController)
    }
}
