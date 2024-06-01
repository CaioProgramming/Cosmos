import Pages.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import di.CommonModule
import features.home.ui.HomePage
import features.home.ui.HomeView
import features.login.LoginPage
import features.login.LoginView
import features.splash.SplashPage
import features.splash.SplashView
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import org.koin.core.context.KoinContext
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import theme.CosmosTheme

@Composable
@Preview
fun App() {
    CosmosTheme {
        KoinApplication(application = {
            startKoin(this)
        }) {
            loadKoinModules(CommonModule.fetchModules())
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
}

enum class Pages(val route: String) {
    SPLASH(SplashPage.tag),
    LOGIN(LoginPage.tag),
    Home(HomePage.tag),
}

@Composable
private fun Pages.getView(navController: NavController) =
    when (this) {
        SPLASH -> SplashView(navController)
        LOGIN -> LoginView(navController)
        Home -> HomeView()
    }
