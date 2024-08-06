@file:OptIn(ExperimentalFoundationApi::class)

package features.home.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import animations.createGradientAnimation
import features.events.ui.eventPager
import features.gallery.ui.GalleryCard
import features.home.presentation.HomeState
import features.home.presentation.HomeViewModel
import features.home.ui.components.EducationCard
import features.home.ui.components.ExploreCard
import features.home.ui.components.ListHeader
import features.news.ui.components.progressIndicators
import io.kamel.image.KamelImage
import io.kamel.image.asyncPainterResource
import kotlinx.coroutines.launch
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions
import theme.defaultRadius
import utils.DateFormats
import utils.fadeBackground
import utils.fadingEdgeTop
import utils.getFormatted

@OptIn(ExperimentalAnimationApi::class)
@Composable
fun HomeView(viewModel: HomeViewModel = koinInject<HomeViewModel>()) {
    val navController = LocalNavController.current
    val state = viewModel.state.collectAsState().value

    LaunchedEffect(state) {
        if (state == null) {
            viewModel.fetchHomePage()
        }
    }
    AnimatedContent(state, transitionSpec = {
        fadeIn(tween(1500)) with fadeOut(tween(1000))
    }) {
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Fixed(2),
        ) {
            if (it is HomeState.Loading) {
                item(span = { GridItemSpan(this.maxLineSpan) }) {
                    LinearProgressIndicator(
                        modifier =
                            Modifier
                                .fillMaxWidth()
                                .padding(Dimensions.padding16)
                                .height(5.dp)
                                .defaultRadius()
                                .createGradientAnimation(),
                        color = MaterialTheme.colors.primary,
                    )
                }
            }

            if (it is HomeState.Success) {
                item(span = { GridItemSpan(this.maxLineSpan) }) {
                    Text(
                        text = DateFormats.DD_OF_MMM_YYY.getFormatted(),
                        style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.W800),
                        modifier = Modifier.padding(16.dp),
                    )
                }
                it.page.latestNews.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        ListHeader("Últimas notícias") {
                            CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.News, navController)
                        }
                    }
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        val pagerState = rememberPagerState(pageCount = { size })
                        val currentPage = this@run[pagerState.currentPage]
                        val coroutineScope = rememberCoroutineScope()
                        Box(
                            modifier =
                                Modifier
                                    .padding(
                                        Dimensions.padding16,
                                    ).fillMaxWidth()
                                    .height(420.dp)
                                    .clip(RoundedCornerShape(CosmosApp.Resources.defaultRadius)),
                        ) {
                            HorizontalPager(
                                state = pagerState,
                                modifier = Modifier.fillMaxSize(),
                            ) {
                                val new = get(it)
                                val thumbnail = asyncPainterResource(new.thumbnailURL)
                                KamelImage(
                                    thumbnail,
                                    contentDescription = new.title,
                                    modifier =
                                        Modifier
                                            .fillMaxSize()
                                            .clickable {
                                                CosmosApp.Navigation.navigateTo(
                                                    CosmosApp.Navigation.Pages.News,
                                                    navController,
                                                )
                                            },
                                    contentScale = ContentScale.Crop,
                                )
                            }
                            progressIndicators(
                                count = this@run.size,
                                currentPage = pagerState.currentPage,
                                modifier = Modifier.fillMaxWidth().padding(Dimensions.padding16).align(Alignment.TopCenter),
                                enableAutoSwipe = true,
                                onFinishPageLoad = {
                                    print("Finished loading page $it")
                                    coroutineScope.launch {
                                        pagerState.animateScrollToPage(it + 1)
                                    }
                                },
                                onSelectIndicator = {
                                    coroutineScope.launch {
                                        pagerState.animateScrollToPage(it)
                                    }
                                },
                            )
                            Column(
                                modifier =
                                    Modifier
                                        .align(Alignment.BottomCenter)
                                        .fillMaxWidth()
                                        .fadeBackground(endColor = MaterialTheme.colors.surface),
                            ) {
                                AnimatedContent(currentPage) {
                                    Text(
                                        it.title,
                                        style = MaterialTheme.typography.h5,
                                        fontWeight = FontWeight.Bold,
                                        modifier = Modifier.fillMaxWidth().padding(Dimensions.padding16),
                                    )
                                }
                            }
                        }
                    }
                }
                it.page.events.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        ListHeader("Próximos eventos") {
                            CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Events, navController)
                        }
                    }

                    item(span = { GridItemSpan((this.maxLineSpan)) }) {
                        eventPager(
                            events = this@run,
                            modifier = Modifier.fillMaxWidth().fillMaxHeight(.4f),
                            onSelectEvent = {
                                CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Events, navController)
                            },
                        )
                    }
                }
                it.page.discoveryCards.run {
                    item(span = { GridItemSpan((this.maxLineSpan)) }) {
                        ListHeader("Curiosidades") {
                            CosmosApp.Navigation.navigateTo(
                                CosmosApp.Navigation.Pages.Discovery,
                                navController,
                            )
                        }
                    }
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        LazyRow {
                            items(count = size) { index ->
                                val card = get(index)
                                card.run {
                                    ExploreCard(
                                        title,
                                        description,
                                        thumbnailURL,
                                        modifier =
                                            Modifier.clickable {
                                                CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Discovery, navController)
                                            },
                                    )
                                }
                            }
                        }
                    }
                }
                it.page.educationCard.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        EducationCard(
                            title,
                            description,
                            thumbnailURL,
                            modifier =
                                Modifier.clickable {
                                    CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Education, navController)
                                },
                        )
                    }
                }
                it.page.gallery.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        ListHeader("Galeria") {
                            CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Gallery, navController)
                        }
                    }
                    items(count = size, span = {
                        val item = get(it)
                        if (item == first()) {
                            GridItemSpan(this.maxLineSpan)
                        } else {
                            GridItemSpan(1)
                        }
                    }) { index ->
                        val gallery = get(index)
                        gallery.run {
                            GalleryCard(
                                title,
                                description,
                                thumbnailURL,
                                modifier =
                                    Modifier
                                        .fillMaxWidth()
                                        .height(200.dp)
                                        .let { if (index == 0) it.fadingEdgeTop() else it }
                                        .clickable { CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Gallery, navController) },
                            )
                        }
                    }
                }
            }
        }
    }
}
