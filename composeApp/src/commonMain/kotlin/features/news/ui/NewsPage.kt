@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package features.news.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.pager.VerticalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import features.news.presentation.NewsState
import features.news.presentation.NewsViewModel
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions

object NewsPage {
    val tag = "NewsPage"
}

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun NewsList(viewModel: NewsViewModel = koinInject()) {
    val state = viewModel.state.collectAsState(null).value
    val navController: NavController = LocalNavController.current
    AnimatedContent(targetState = state, transitionSpec = {
        slideInVertically(tween(500)) { -1 } + fadeIn(tween(2000)) with
            fadeOut(
                tween(1000),
            ) + slideOutHorizontally(tween(500)) { 1 }
    }) {
        Box {
            when (it) {
                NewsState.Error ->
                    Text(
                        "Ocorreu um erro inesperado",
                        modifier = Modifier.align(Alignment.Center),
                    )

                is NewsState.Success -> {
                    val news = remember { it.newsData.news }

                    val pagerState =
                        rememberPagerState {
                            news.size
                        }
                    val headerVisible =
                        remember {
                            mutableStateOf(true)
                        }
                    VerticalPager(pagerState, modifier = Modifier.fillMaxSize()) {
                        val new = news[it]
                        val firstPage = new.pages.first()
                        val thumbnail = asyncPainterResource(firstPage.thumbnailURL)
                        KamelImage(
                            thumbnail,
                            contentScale = ContentScale.Crop,
                            contentDescription = firstPage.title,
                            modifier = Modifier.fillMaxSize(),
                        )
                    }

                    Column(
                        modifier =
                            Modifier
                                .align(Alignment.BottomCenter)
                                .fillMaxWidth()
                                .background(
                                    Brush.verticalGradient(
                                        listOf(
                                            Color.Transparent.toComposeColor(),
                                            MaterialTheme.colors.background.copy(alpha = 0.5f),
                                            MaterialTheme.colors.background,
                                        ),
                                    ),
                                ).padding(Dimensions.padding16),
                    ) {
                        val page = news[pagerState.currentPage]
                        AnimatedContent(page, transitionSpec = { slideInVertically() + fadeIn() with fadeOut() }) {
                            Text(
                                it.pages.first().title,
                                style = MaterialTheme.typography.h5,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.fillMaxWidth().padding(Dimensions.padding16),
                            )
                        }
                        AnimatedContent(page, transitionSpec = { slideInVertically() + fadeIn() with fadeOut() }) {
                            Text(
                                it.pages.first().description,
                                style = MaterialTheme.typography.body1,
                                maxLines = 5,
                                modifier =
                                    Modifier.fillMaxWidth().padding(
                                        horizontal = Dimensions.padding16,
                                        vertical = Dimensions.padding8,
                                    ),
                            )
                        }

                        Button(
                            modifier = Modifier.fillMaxWidth().navigationBarsPadding(),
                            shape = RoundedCornerShape(CosmosApp.Resources.defaultRadius),
                            onClick = {
                                CosmosApp.Navigation.navigateWithArgs(
                                    CosmosApp.Navigation.Pages.NewsDetails,
                                    args = mapOf("id" to page.id),
                                    navController,
                                )
                            },
                        ) {
                            Text(
                                "Continuar lendo",
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(Dimensions.padding8),
                            )
                            Icon(Icons.AutoMirrored.Rounded.KeyboardArrowRight, contentDescription = null)
                        }
                    }

                    Row(
                        modifier =
                            Modifier
                                .background(
                                    Brush.verticalGradient(
                                        listOf(
                                            Color.Transparent.toComposeColor(),
                                            MaterialTheme.colors.background.copy(alpha = 0.5f),
                                            MaterialTheme.colors.background,
                                        ).reversed(),
                                    ),
                                ).displayCutoutPadding()
                                .fillMaxWidth(),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                    ) {
                        IconButton(
                            { navController.popBackStack() },
                            modifier =
                                Modifier
                                    .displayCutoutPadding()
                                    .padding(Dimensions.padding16),
                        ) {
                            Icon(
                                Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                                contentDescription = null,
                                tint = MaterialTheme.colors.onSurface,
                            )
                        }
                        val titleAlpha = animateFloatAsState(if (headerVisible.value) 1f else 0f)
                        Text(
                            "Notícias",
                            textAlign = TextAlign.Center,
                            style = MaterialTheme.typography.h6,
                            modifier = Modifier.alpha(titleAlpha.value),
                        )
                        Box(Modifier.padding(Dimensions.padding16).size(32.dp))
                    }
                }
                NewsState.Loading -> CosmosApp.Resources.animatedIcon(modifier = Modifier.align(Alignment.Center))
                else -> Box {}
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.fetchNews()
    }
}

fun String.addArgs(value: String): String {
    if (this.last() != '/') {
        this.plus("/")
    }
    return this.plus(value)
}

fun String.implementArgs(
    field: String,
    value: String,
): String = this.replace("{$field}", value)
