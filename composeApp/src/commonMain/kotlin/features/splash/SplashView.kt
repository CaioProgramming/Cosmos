package features.splash

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
import com.chrynan.colors.extension.CornflowerBlue
import com.chrynan.colors.extension.MediumPurple
import com.chrynan.colors.extension.Purple
import features.login.LoginPage
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.CosmosIcon
import theme.Typo

object SplashPage {
    val tag = "SplashPage"
}
@Composable
fun SplashView(navController: NavController) {

    fun navigateToLogin() {
        navController.navigate(LoginPage.tag)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        val purple = Color.Companion.Purple.toComposeColor()
        val purpleMedium = Color.Companion.MediumPurple.toComposeColor()
        val blue = Color.Companion.CornflowerBlue.toComposeColor()
        Row(verticalAlignment = Alignment.CenterVertically) {
            CosmosIcon(
                modifier =
                Modifier.createGradientAnimation(
                    listOf(
                        MaterialTheme.colors.primary,
                        blue,
                        purpleMedium,
                        purple,
                    ),
                ).clickable {
                    navigateToLogin()
                },
            )

            Text(
                text = "osmos",
                style = MaterialTheme.typography.h4.copy(fontFamily = Typo.headFontFamily()),
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
