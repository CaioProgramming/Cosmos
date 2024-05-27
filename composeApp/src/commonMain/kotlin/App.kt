import Pages.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import features.login.Login
import features.login.LoginPage
import features.splash.SplashPage
import features.splash.SplashView
import org.jetbrains.compose.ui.tooling.preview.Preview
import theme.CosmosTheme

@Composable
@Preview
fun App() {
    CosmosTheme {
        val navController = rememberNavController()
        Scaffold {
            NavHost(
                navController = navController,
                startDestination = SPLASH.route,
                modifier = Modifier.fillMaxSize(),
            ) {
                Pages.entries.map { page ->
                    composable(page.route) { page.getView(navController) }
                }
            }
        }
    }
}

enum class Pages(val route: String) {
    SPLASH(SplashPage.tag),
    LOGIN(LoginPage.tag),
}



@Composable
private fun Pages.getView(navController: NavController) =
    when (this) {
        SPLASH -> SplashView(navController)
        LOGIN -> Login()
    }
