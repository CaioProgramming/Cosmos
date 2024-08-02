@file:OptIn(ExperimentalFoundationApi::class, ExperimentalAnimationApi::class)

package features.news.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleIn
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.slideOutVertically
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowLeft
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalUriHandler
import androidx.compose.ui.platform.UriHandler
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import features.news.data.model.NewsInfo
import features.news.presentation.NewsState
import features.news.presentation.NewsViewModel
import io.kamel.core.isSuccess
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun newsDetails(newsId: String) {
    val viewModel = koinInject<NewsViewModel>()
    val state = viewModel.state.collectAsState().value
    val requestedLink = mutableStateOf<String?>(null)
    val uriHandler = LocalUriHandler.current
    val navController = LocalNavController.current

    fun openUrl(link: String) {
        uriHandler.openUri(link)
        requestedLink.value = null
    }

    AnimatedContent(state, transitionSpec = {
        slideInVertically(tween(1500)) { -1 } + fadeIn(tween(500)) with
            fadeOut(
                tween(1000),
            ) + slideOutVertically { 1 }
    }) {
        Box(modifier = Modifier.fillMaxSize()) {
            when (it) {
                NewsState.Error -> Text("Ocorreu um erro inesperado", modifier = Modifier.align(Alignment.Center))
                is NewsState.DetailSuccess -> newsPageData(it.news, uriHandler, Modifier.fillMaxSize())
                else -> CosmosApp.Resources.animatedIcon(modifier = Modifier.align(Alignment.Center))
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.fetchNew(newsId)
    }
}

@Composable
fun newsPageData(
    news: NewsInfo,
    uriHandler: UriHandler = LocalUriHandler.current,
    modifier: Modifier,
    navController: NavController = LocalNavController.current,
) = LazyColumn(modifier) {
    fun openUrl(link: String) {
        uriHandler.openUri(link)
    }
    news.pages.forEachIndexed { index, page ->

        item {
            val thumbnail = asyncPainterResource(page.thumbnailURL)
            val imageSize = animateDpAsState(if (index == 0) 350.dp else 250.dp).value
            val imageModifier = Modifier.height(imageSize).fillMaxWidth()

            AnimatedVisibility(thumbnail.isSuccess) {
                Box {
                    KamelImage(
                        thumbnail,
                        contentScale = ContentScale.Crop,
                        contentDescription = page.title,
                        modifier = imageModifier,
                    )

                    AnimatedVisibility(
                        index == 0,
                        enter = scaleIn(),
                        exit = scaleOut(),
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
                    ) {
                        Box {
                            IconButton(
                                { navController.popBackStack() },
                                modifier =
                                    Modifier
                                        .displayCutoutPadding()
                                        .padding(Dimensions.padding16)
                                        .align(Alignment.TopStart),
                            ) {
                                Icon(
                                    Icons.AutoMirrored.Rounded.KeyboardArrowLeft,
                                    contentDescription = null,
                                    tint = MaterialTheme.colors.onSurface,
                                )
                            }
                        }
                    }
                }
            }
        }

        stickyHeader {
            AnimatedVisibility(page.title.isNotEmpty()) {
                Text(
                    text = page.title,
                    style = MaterialTheme.typography.h5,
                    fontWeight = FontWeight.Bold,
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .background(MaterialTheme.colors.background)
                            .displayCutoutPadding()
                            .padding(Dimensions.padding16),
                )
            }
        }
        if (index == 0) {
            item {
                Text(
                    text = "Publicado por ${news.reference.author}",
                    style = MaterialTheme.typography.caption,
                    textAlign = TextAlign.Start,
                    fontWeight = FontWeight.Bold,
                    modifier =
                        Modifier
                            .fillMaxWidth()
                            .padding(Dimensions.padding16)
                            .clickable {
                                openUrl(news.reference.link)
                            },
                )
            }
        }
        item {
            Text(
                text = page.description,
                style = MaterialTheme.typography.body1,
                textAlign = TextAlign.Justify,
                modifier = Modifier.padding(Dimensions.padding16),
            )
        }
    }
}
