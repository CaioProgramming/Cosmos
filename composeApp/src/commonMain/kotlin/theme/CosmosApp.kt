package theme

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInVertically
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import animations.createGradientAnimation
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import com.ilustris.cosmos.resources.Res
import com.ilustris.cosmos.resources.astronaut_placeholder
import com.ilustris.cosmos.resources.heart_fill_24
import com.ilustris.cosmos.resources.heart_outline_24
import com.ilustris.cosmos.resources.home_24_fill
import com.ilustris.cosmos.resources.home_24_outline
import com.ilustris.cosmos.resources.moon_24
import com.ilustris.cosmos.resources.romauntgaolines
import com.ilustris.cosmos.resources.sf_pro
import features.events.ui.EventView
import features.events.ui.EventsPage
import features.home.ui.HomePage
import features.home.ui.HomeView
import features.login.LoginPage
import features.login.LoginView
import features.news.ui.NewsPage
import features.news.ui.NewsView
import features.splash.SplashPage
import features.splash.SplashView
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.jetbrains.compose.resources.DrawableResource
import org.jetbrains.compose.resources.Font
import org.jetbrains.compose.resources.painterResource
import theme.CosmosApp.Typo.cosmoTypography

object CosmosApp {
    @Composable
    private fun typography() = cosmoTypography()

    @Composable
    fun theme(
        content:
            @Composable()
            () -> Unit,
    ) {
        return MaterialTheme(
            colors = Colors.DarkColorScheme,
            content = content,
            typography = typography(),
        )
    }

    object Resources {
        val defaultRadius = Corners.large

        @Composable
        fun icon(
            modifier: Modifier = Modifier,
            tint: androidx.compose.ui.graphics.Color = MaterialTheme.colors.onBackground,
        ) = Icon(
            painter = painterResource(Res.drawable.moon_24),
            contentDescription = null,
            modifier = modifier.size(32.dp),
            tint = tint,
        )

        @Composable
        fun largeIcon(
            modifier: Modifier = Modifier,
            tint: androidx.compose.ui.graphics.Color = MaterialTheme.colors.onBackground,
        ) = Icon(
            painter = painterResource(Res.drawable.moon_24),
            contentDescription = null,
            modifier = modifier.size(64.dp),
            tint = tint,
        )

        @Composable
        fun animatedIcon(modifier: Modifier) {
            Icon(
                painter = painterResource(Res.drawable.moon_24),
                contentDescription = null,
                modifier = modifier.createGradientAnimation(),
            )
        }

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
        private val White = androidx.compose.ui.graphics.Color(0xFFFFFFFF)
        val Black = androidx.compose.ui.graphics.Color(0xff000000)

        private val DarkBackground = androidx.compose.ui.graphics.Color(0xff050522)
        private val DarkSurface = androidx.compose.ui.graphics.Color(0xff212165)
        val LightBackground = androidx.compose.ui.graphics.Color(0xFFf2f2f2)

        private val primary = androidx.compose.ui.graphics.Color(0xff0f0e62)
        private val secondary = androidx.compose.ui.graphics.Color(0xffa96ec9)
        private val tertiary = androidx.compose.ui.graphics.Color(0xff8767fa)
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
        data class IconConfig(val outlineIcon: DrawableResource, val filledIcon: DrawableResource)

        enum class Pages(
            val route: String,
            val icon: IconConfig? = null,
            val showBottomNav: Boolean = false,
            val view:
                @Composable
                () -> Unit = { Resources.animatedIcon(Modifier.size(64.dp)) },
        ) {
            Splash(SplashPage.tag, view = { SplashView() }),
            Login(LoginPage.tag, view = { LoginView() }),
            Favorites("/undefined", IconConfig(Res.drawable.heart_outline_24, Res.drawable.heart_fill_24), true),
            Home(HomePage.tag, IconConfig(Res.drawable.home_24_outline, Res.drawable.home_24_fill), true, { HomeView() }),
            Profile("/todo", null, true),
            Events(EventsPage.tag, view = { EventView() }),
            News(NewsPage.tag, view = { NewsView() }),
        }

        @Composable
        fun BottomNav(
            navController: NavController,
            userIcon: String? = null,
        ) {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentPage = navBackStackEntry?.destination?.route
            AnimatedVisibility(currentPage != SplashPage.tag, enter = slideInVertically { -1 }, exit = scaleOut()) {
                BottomNavigation(
                    backgroundColor = Colors.LightBackground,
                    contentColor = Colors.Black,
                    modifier = Modifier.padding(Dimensions.padding16).shapeRadius20(),
                ) {
                    Pages.entries.filter { it.showBottomNav }.forEach { page ->
                        val selected = currentPage == page.route
                        val color = Color.Black.toComposeColor().copy(alpha = 0.8f)
                        val alpha = animateFloatAsState(if (selected) 1f else 0.5f, tween(300))
                        val size = animateDpAsState(if (selected) 32.dp else 24.dp, tween(300))
                        BottomNavigationItem(
                            icon = {
                                if (page == Pages.Profile) {
                                    if (userIcon == null) {
                                        Image(
                                            painterResource(Res.drawable.astronaut_placeholder),
                                            contentScale = ContentScale.Crop,
                                            contentDescription = null,
                                            modifier =
                                            Modifier
                                                .background(MaterialTheme.colors.secondary, CircleShape)
                                                .size(size.value)
                                                .clip(CircleShape)
                                                .border(2.dp, color, CircleShape).alpha(alpha.value),
                                        )
                                    } else {
                                        KamelImage(
                                            asyncPainterResource(userIcon),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier =
                                            Modifier.size(
                                                size.value,
                                            ).clip(CircleShape).border(2.dp, color, CircleShape).alpha(alpha.value),
                                        )
                                    }
                                } else {
                                    val currentIcon = if (selected) page.icon?.filledIcon else page.icon?.outlineIcon
                                    Icon(
                                        painterResource(currentIcon ?: Res.drawable.moon_24),
                                        contentDescription = page.route,
                                        tint = color,
                                        modifier = Modifier.size(size.value).alpha(alpha.value),
                                    )
                                }
                            },
                            selected = selected,
                            onClick = {
                                navController.navigate(page.route)
                            },
                        )
                    }
                }
            }

        }
    }
}

object Dimensions {
    val padding4 = 4.dp
    val padding8 = 8.dp
    val padding16 = 16.dp
    val padding24 = 24.dp

    val radius5 = 5.dp
    val radius10 = 10.dp
    val radius15 = 15.dp
    val radius20 = 20.dp
}

object Corners {
    val small = Dimensions.radius5
    val medium = Dimensions.radius10
    val large = Dimensions.radius15
    val extraLarge = Dimensions.radius20
}

@Composable
fun Modifier.defaultRadius() = clip(RoundedCornerShape(CosmosApp.Resources.defaultRadius))
