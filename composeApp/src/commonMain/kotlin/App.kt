import Pages.*
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import di.CommonModule
import features.home.ui.HomePage
import features.home.ui.HomeView
import features.login.LoginPage
import features.login.LoginView
import features.news.ui.NewsPage
import features.news.ui.NewsView
import features.splash.SplashPage
import features.splash.SplashView
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.KoinApplication
import org.koin.core.context.KoinContext
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import theme.CosmosTheme


val LocalNavController = compositionLocalOf<NavHostController> { error("NavController not found") }
@Composable
fun App() {
    CompositionLocalProvider(LocalNavController provides rememberNavController()) {
        CosmosTheme {
            KoinApplication(application = {
                startKoin(this)
            }) {
                loadKoinModules(CommonModule.fetchModules())
                val navController = rememberNavController()
                Scaffold {
                    NavHost(
                        navController = LocalNavController.current,
                        startDestination = SPLASH.route,
                        modifier = Modifier.fillMaxSize().padding(vertical = 50.dp),
                    ) {
                        Pages.entries.map { page ->
                            composable(page.route) { page.getView() }
                        }
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
    News(NewsPage.tag),
}

@Composable
private fun Pages.getView() =
    when (this) {
        SPLASH -> SplashView()
        LOGIN -> LoginView()
        Home -> HomeView()
        News -> NewsView()
    }
