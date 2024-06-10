import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import di.CommonModule
import org.koin.compose.KoinApplication
import org.koin.core.context.loadKoinModules
import org.koin.core.context.startKoin
import theme.CosmosApp

val LocalNavController = compositionLocalOf<NavHostController> { error("NavController not found") }

@Composable
fun App() {
    CompositionLocalProvider(LocalNavController provides rememberNavController()) {
        CosmosApp.theme {
            KoinApplication(application = {
                startKoin(this)
            }) {
                loadKoinModules(CommonModule.fetchModules())
                val navController = LocalNavController.current
                Scaffold(
                    // TODO: Add bottomBar
                    // bottomBar = { CosmosApp.Navigation.BottomNav(navController) }
                ) {
                    NavHost(
                        navController = navController,
                        startDestination = CosmosApp.Navigation.Pages.Splash.route,
                        modifier = Modifier.fillMaxSize().padding(vertical = 50.dp),
                    ) {
                        CosmosApp.Navigation.Pages.entries.forEach { page ->
                            composable(page.route) { page.view() }
                        }
                    }
                }
            }
        }
    }
}
