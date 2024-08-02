package theme

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.EnterTransition
import androidx.compose.animation.ExitTransition
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.EaseIn
import androidx.compose.animation.core.RepeatMode
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NamedNavArgument
import androidx.navigation.NavController
import androidx.navigation.NavType
import androidx.navigation.navArgument
import animations.createGradientAnimation
import com.chrynan.colors.Color
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.heart_fill_24
import com.ilustris.cosmos.resources.heart_outline_24
import com.ilustris.cosmos.resources.home_24_fill
import com.ilustris.cosmos.resources.home_24_outline
import com.ilustris.cosmos.resources.ic_astronaut
import com.ilustris.cosmos.resources.moon_24
import com.ilustris.cosmos.resources.romauntgaolines
import com.ilustris.cosmos.resources.sf_pro
import features.discovery.ui.DiscoveryDetail
import features.discovery.ui.DiscoveryView
import features.education.ui.EducationView
import features.events.ui.EventView
import features.gallery.ui.GallerySlidesView
import features.gallery.ui.GalleryView
import features.home.ui.HomeView
import features.login.LoginView
import features.news.ui.NewsList
import features.splash.SplashView
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import service.emptyString
import theme.CosmosApp.Typo.cosmoTypography
import utils.NavigationUtils.replaceArgs

object CosmosApp {
    @Composable
    private fun typography() = cosmoTypography()

    @Composable
    fun theme(
        content:
            @Composable()
            () -> Unit,
    ) = MaterialTheme(
        colors = Colors.DarkColorScheme,
        content = content,
        typography = typography(),
    )

    object Resources {
        val defaultRadius = Corners.large

        @Composable
        fun icon(
            modifier: Modifier = Modifier.size(32.dp),
            tint: androidx.compose.ui.graphics.Color = MaterialTheme.colors.onBackground,
        ) = Icon(
            painter = painterResource(Res.drawable.moon_24),
            contentDescription = null,
            modifier = modifier,
            tint = MaterialTheme.colors.onBackground,
        )

        @Composable
        fun largeIcon(
            modifier: Modifier = Modifier,
            tint: androidx.compose.ui.graphics.Color = MaterialTheme.colors.onBackground,
        ) = icon(modifier.size(64.dp))

        @Composable
        fun animatedIcon(modifier: Modifier = Modifier) = icon(modifier.createGradientAnimation())

        @Composable
        fun brush(): Brush {
            val colors = Colors.themeColors()

            return Brush.linearGradient(colors)
        }

        @Composable
        fun backGroundBrush(): Brush {
            val colors =
                listOf(
                    Colors.DarkColorScheme.surface,
                    Colors.DarkColorScheme.background,
                )

            return Brush.verticalGradient(colors)
        }
    }

    object Typo {
        @Composable
        fun headFontFamily() = FontFamily(Font(Res.font.romauntgaolines))

        @Composable
        fun defaultFontFamily() = FontFamily(Font(Res.font.sf_pro))

        @Composable
        fun cosmoTypography() =
            MaterialTheme.typography.copy(
                h1 = MaterialTheme.typography.h1.copy(fontFamily = headFontFamily(), fontWeight = FontWeight.W400),
                h2 = MaterialTheme.typography.h2.copy(fontFamily = headFontFamily(), fontWeight = FontWeight.SemiBold),
                h3 = MaterialTheme.typography.h3.copy(fontWeight = FontWeight.Medium),
                h4 = MaterialTheme.typography.h4.copy(fontWeight = FontWeight.W500),
                h5 = MaterialTheme.typography.h5.copy(fontWeight = FontWeight.W800),
                h6 = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.W600),
                body1 = MaterialTheme.typography.body1.copy(fontWeight = FontWeight.Normal),
                body2 = MaterialTheme.typography.body2.copy(fontWeight = FontWeight.Thin),
                subtitle1 = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Normal),
                subtitle2 = MaterialTheme.typography.subtitle1.copy(fontWeight = FontWeight.Light),
            )
    }

    object Colors {
        private val White =
            androidx.compose.ui.graphics
                .Color(0xFFFFFFFF)
        val Black =
            androidx.compose.ui.graphics
                .Color(0xff000000)

        private val DarkBackground =
            androidx.compose.ui.graphics
                .Color(0xff050522)
        private val DarkSurface =
            androidx.compose.ui.graphics
                .Color(0xff212165)
        val LightBackground =
            androidx.compose.ui.graphics
                .Color(0xFFf2f2f2)

        private val primary =
            androidx.compose.ui.graphics
                .Color(0xff0f0e62)
        private val secondary =
            androidx.compose.ui.graphics
                .Color(0xffa96ec9)
        private val tertiary =
            androidx.compose.ui.graphics
                .Color(0xff8767fa)
        val DarkColorScheme =
            darkColors(
                primary = primary,
                secondary = secondary,
                background = DarkBackground,
                surface = DarkSurface,
                onPrimary = White,
                onSurface = White,
                onBackground = White,
            )

        fun themeColors() = listOf(DarkBackground, primary, secondary, tertiary, DarkSurface)
    }

    object Navigation {
        fun navigateTo(
            page: Pages,
            navController: NavController,
        ) {
            navController.navigate(page.pageConfig.route)
        }

        fun navigateWithArgs(
            page: Pages,
            args: Map<String, String>,
            navController: NavController,
        ) {
            var route = page.pageConfig.route
            print("\n navigating to page => ${page.pageConfig.key}: $route")
            route = route.replaceArgs(args)
            print("\n formatted route => $route")
            navController.navigate(route) {
            }
        }

        data class IconConfig(
            val outlineIcon: DrawableResource,
            val filledIcon: DrawableResource,
        )

        data class PageConfig(
            val title: String,
            val key: String,
            val arguments: List<NamedNavArgument> = emptyList(),
        ) {
            private fun argumentsPath() =
                arguments.joinToString("/") {
                    "{${it.name}}"
                }

            val route = "$NAVIGATION_ROOT_PATH/$key/${argumentsPath()}"
        }

        enum class Pages(
            val pageConfig: PageConfig,
            val icon: IconConfig? = null,
            val showBottomNav: Boolean = false,
            val showAppBar: Boolean = true,
            val enterTransition: EnterTransition = fadeIn(tween(1000, easing = EaseIn)),
            val exitTransition: ExitTransition = fadeOut(tween(500, easing = EaseIn)),
            val view:
                @Composable (Map<String, String?>) -> Unit = { Resources.animatedIcon(Modifier.size(64.dp)) },
        ) {
            Splash(
                PageConfig(
                    emptyString(),
                    "Splash",
                ),
                showAppBar = false,
                showBottomNav = false,
                view = { SplashView() },
            ),
            Login(
                PageConfig(
                    emptyString(),
                    "Login",
                ),
                view = { LoginView() },
            ),
            Favorites(
                PageConfig(
                    "Favoritos",
                    "Favorites",
                ),
                IconConfig(
                    outlineIcon = Res.drawable.heart_outline_24,
                    filledIcon = Res.drawable.heart_fill_24,
                ),
                true,
            ),
            Home(
                PageConfig(
                    title = "Cosmos",
                    key = "Home",
                ),
                icon = IconConfig(Res.drawable.home_24_outline, Res.drawable.home_24_fill),
                showBottomNav = true,
                view = { HomeView() },
            ),
            Profile(
                PageConfig(
                    title = "Meu Perfil",
                    key = "Profile",
                ),
                icon = IconConfig(Res.drawable.ic_astronaut, Res.drawable.ic_astronaut),
                showBottomNav = true,
            ),
            Events(
                PageConfig(
                    "Eventos",
                    "Events",
                ),
                view = { EventView() },
            ),
            News(
                PageConfig(
                    "Notícias",
                    "News",
                ),
                showAppBar = false,
                enterTransition = slideInHorizontally { 1 },
                exitTransition = slideOutHorizontally { -1 },
                view = { NewsList() },
            ),
            NewsDetails(
                PageConfig(
                    emptyString(),
                    "DetailNew",
                    arguments = listOf(navArgument("id") { type = NavType.StringType }),
                ),
                showBottomNav = true,
                showAppBar = false,
                enterTransition = slideInHorizontally { 1 },
                exitTransition = slideOutHorizontally { -1 },
                view = {
                    val id = it["id"]
                    id?.let { it1 -> features.news.ui.newsDetails(it1) }
                },
            ),
            Gallery(
                PageConfig(
                    "Galeria",
                    "Gallery",
                ),
                showBottomNav = true,
                view = { GalleryView() },
            ),
            GallerySlides(
                PageConfig(
                    "Slide Gallery",
                    "slide-pics",
                    arguments = listOf(navArgument("position") { type = NavType.IntType }),
                ),
                showBottomNav = false,
                showAppBar = false,
                view = {
                    val position = it["position"]?.toIntOrNull()
                    GallerySlidesView(position)
                },
            ),
            Discovery(
                PageConfig(
                    "Curiosidades",
                    "Discovery",
                ),
                showBottomNav = true,
                showAppBar = true,
                view = { DiscoveryView() },
            ),
            DiscoveryDetail(
                PageConfig(
                    emptyString(),
                    "detail-discover",
                    arguments =
                        listOf(
                            navArgument("id") {
                                type = NavType.StringType
                            },
                        ),
                ),
                showBottomNav = true,
                showAppBar = false,
                view = {
                    val id = it["id"]
                    DiscoveryDetail(id)
                },
            ),
            Education(
                pageConfig = PageConfig("Planetas e constelações", "Planets"),
                showBottomNav = false,
                showAppBar = false,
                view = { EducationView() },
            ),
            ;

            companion object {
                fun getFromKey(route: String?): Pages? {
                    route?.let {
                        val page =
                            entries.firstOrNull { page ->
                                // print("\nComparing route $it\n with ${page.pageConfig.key}")
                                it.contains(page.pageConfig.key, true)
                            }
                        print("\nFound page => $page\n")
                        return page
                    } ?: run {
                        print("\nNo page found\n")
                        return null
                    }
                }
            }
        }

        @OptIn(ExperimentalAnimationApi::class)
        @Composable
        fun BottomNav(
            currentPage: Pages?,
            userIcon: String? = null,
            onNavigate: (Pages) -> Unit,
        ) {
            AnimatedVisibility(
                currentPage != Pages.Splash,
                enter = slideInVertically { -1 },
                exit = scaleOut(),
            ) {
                BottomNavigation(
                    backgroundColor = MaterialTheme.colors.background,
                    elevation = 0.dp,
                    contentColor = Colors.Black,
                    modifier = Modifier.navigationBarsPadding().fillMaxWidth(),
                ) {
                    Pages.entries.filter { it.icon != null }.forEach { page ->
                        val selected = currentPage == page
                        val color = MaterialTheme.colors.onBackground
                        val size = 48.dp
                        val borderWidth = animateDpAsState(if (selected) 2.dp else 0.dp).value
                        BottomNavigationItem(
                            icon = {
                                val infiniteTransition = rememberInfiniteTransition()
                                val offsetAnimation =
                                    infiniteTransition.animateFloat(
                                        initialValue = 0f,
                                        targetValue = 100f,
                                        animationSpec =
                                            infiniteRepeatable(
                                                tween(3000, easing = EaseIn),
                                                repeatMode = RepeatMode.Reverse,
                                            ),
                                    )
                                val currentIcon = if (selected) page.icon?.filledIcon else page.icon?.outlineIcon
                                Icon(
                                    painterResource(currentIcon ?: Res.drawable.moon_24),
                                    contentDescription = page.pageConfig.title,
                                    tint = color,
                                    modifier =
                                        Modifier
                                            .size(size)
                                            .background(MaterialTheme.colors.background, CircleShape)
                                            .border(
                                                borderWidth,
                                                Brush.linearGradient(
                                                    Colors.themeColors(),
                                                    start =
                                                        if (selected) {
                                                            Offset(
                                                                offsetAnimation.value,
                                                                offsetAnimation.value,
                                                            )
                                                        } else {
                                                            Offset.Zero
                                                        },
                                                ),
                                                CircleShape,
                                            ).padding(Dimensions.padding16),
                                )
                            },
                            selected = selected,
                            onClick = {
                                onNavigate(page)
                            },
                        )
                    }
                }
            }
        }
    }
}

@Composable
fun Modifier.defaultRadius() = clip(RoundedCornerShape(CosmosApp.Resources.defaultRadius))

private const val NAVIGATION_ROOT_PATH = "cosmos:/"
