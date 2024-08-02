@file:OptIn(
    ExperimentalMaterial3Api::class,
    ExperimentalMaterial3Api::class,
    ExperimentalAnimationApi::class,
)

import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.with
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberTopAppBarState
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.TileMode
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.navigation.NavDeepLink
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.ic_left
import com.ilustris.cosmos.resources.moon_24
import di.CommonModule
import org.jetbrains.compose.resources.painterResource
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
                val navControllerState = LocalNavController.current.currentBackStackEntryAsState().value
                val currentPage = CosmosApp.Navigation.Pages.getFromKey(navControllerState?.destination?.route)
                val barState = rememberTopAppBarState()
                val scrollBehavior =
                    TopAppBarDefaults.enterAlwaysScrollBehavior(
                        barState,
                    )

                fun isAppBarHidden() = currentPage?.showAppBar == false

                fun isNavBarHidden() = currentPage?.showBottomNav == false
                val headlineSize = MaterialTheme.typography.h4.fontSize.value
                val smallTitleSize = MaterialTheme.typography.h6.fontSize.value
                val targetSize = lerp(headlineSize, smallTitleSize, scrollBehavior.state.collapsedFraction)

                Scaffold(
                    modifier = Modifier.fillMaxSize().nestedScroll(scrollBehavior.nestedScrollConnection),
                    topBar = {
                        AnimatedVisibility(!isAppBarHidden(), enter = fadeIn(), exit = fadeOut()) {
                            MediumTopAppBar(
                                colors =
                                    TopAppBarDefaults.mediumTopAppBarColors().copy(
                                        scrolledContainerColor = MaterialTheme.colors.background,
                                        containerColor = MaterialTheme.colors.background,
                                    ),
                                scrollBehavior = scrollBehavior,
                                modifier = Modifier.displayCutoutPadding(),
                                title = {
                                    AnimatedContent(currentPage?.pageConfig?.title ?: "Cosmos", contentAlignment = Alignment.Center) {
                                        Text(
                                            it,
                                            style = MaterialTheme.typography.h4,
                                            fontSize = targetSize.sp,
                                            fontWeight = FontWeight.Bold,
                                        )
                                    }
                                },
                                navigationIcon = {
                                    val icon =
                                        if (currentPage != CosmosApp.Navigation.Pages.Home) {
                                            Res.drawable.ic_left
                                        } else {
                                            Res.drawable.moon_24
                                        }

                                    val description =
                                        if (currentPage != CosmosApp.Navigation.Pages.Home) {
                                            "voltar"
                                        } else {
                                            "Home"
                                        }

                                    AnimatedContent(
                                        icon,
                                        contentAlignment = Alignment.Center,
                                        modifier = Modifier.padding(horizontal = 8.dp),
                                        transitionSpec = {
                                            scaleIn() with scaleOut()
                                        },
                                    ) {
                                        Icon(
                                            painter = painterResource(icon),
                                            contentDescription = description,
                                            modifier =
                                                Modifier
                                                    .size(32.dp)
                                                    .clip(CircleShape)
                                                    .clickable { navController.popBackStack() },
                                        )
                                    }
                                },
                                actions = {
                                    Box(Modifier.size(32.dp))
                                },
                            )
                        }
                    },
                    bottomBar = {
                        AnimatedVisibility(!isNavBarHidden(), enter = fadeIn(), exit = fadeOut()) {
                            CosmosApp.Navigation.BottomNav(currentPage) {
                                if (currentPage != it) {
                                    navController.navigate(
                                        it.pageConfig.route,
                                    )
                                }
                            }
                        }
                    },
                ) { padding ->

                    val isShowingBottomNav = currentPage?.showBottomNav == true
                    val navigationPadding = animateDpAsState(if (isShowingBottomNav) 50.dp else 0.dp, tween(1000))

                    Box(modifier = Modifier.fillMaxSize().padding(bottom = navigationPadding.value)) {
                        NavHost(
                            modifier = Modifier.fillMaxSize().padding(bottom = navigationPadding.value),
                            navController = navController,
                            startDestination = CosmosApp.Navigation.Pages.Splash.pageConfig.route,
                        ) {
                            CosmosApp.Navigation.Pages.entries.forEach { page ->
                                print("\nPage: ${page.pageConfig.route}\n")
                                composable(
                                    page.pageConfig.route,
                                    enterTransition = { page.enterTransition },
                                    exitTransition = { page.exitTransition },
                                    deepLinks =
                                        listOf(
                                            NavDeepLink
                                                .Builder()
                                                .setUriPattern(page.pageConfig.route)
                                                .build(),
                                        ),
                                ) { backStackEntry ->
                                    val args =
                                        page.pageConfig.arguments.associate {
                                            it.name to backStackEntry.arguments?.getString(it.name)
                                        }
                                    page.view(args)
                                }
                            }
                        }

                        AnimatedVisibility(
                            !isNavBarHidden(),
                            enter = fadeIn(),
                            exit = fadeOut(),
                            modifier = Modifier.align(Alignment.BottomCenter),
                        ) {
                            Box(
                                modifier =
                                    Modifier
                                        .navigationBarsPadding()
                                        .fillMaxWidth()
                                        .height(150.dp)
                                        .background(
                                            Brush.verticalGradient(
                                                colorStops =
                                                    arrayOf(
                                                        0.0f to Color.Transparent.toComposeColor(),
                                                        0.2f to MaterialTheme.colors.background.copy(alpha = 0.5f),
                                                        1.0f to MaterialTheme.colors.background,
                                                    ),
                                                tileMode = TileMode.Decal,
                                            ),
                                        ),
                            )
                        }
                    }
                }
            }
        }
    }
}
