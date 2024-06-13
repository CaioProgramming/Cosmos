@file:OptIn(ExperimentalFoundationApi::class)

package features.home.ui

import LocalNavController
import androidx.compose.animation.AnimatedContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.animation.scaleOut
import androidx.compose.animation.slideInVertically
import androidx.compose.animation.with
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Icon
import androidx.compose.material.LinearProgressIndicator
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import animations.createGradientAnimation
import features.events.ui.components.EventCard
import features.home.presentation.HomeState
import features.home.presentation.HomeViewModel
import features.home.ui.components.CardItem
import features.home.ui.components.EducationCard
import features.home.ui.components.ExploreCard
import features.home.ui.components.GalleryCard
import features.home.ui.components.ListHeader
import features.news.ui.NewsPage
import org.koin.compose.koinInject
import theme.CosmosApp
import theme.Dimensions
import theme.defaultRadius
import utils.DateFormats
import utils.getFormatted





@Composable
fun HomeHeader(isLoading: Boolean) {
    Box(
        modifier =
        Modifier.fillMaxWidth()
            .wrapContentHeight()
            .animateContentSize(tween(500)),
    ) {
        TopAppBar(
            title = {
                if(isLoading) {
                    CosmosApp.Resources.icon(modifier = Modifier.createGradientAnimation())
                } else {
                    CosmosApp.Resources.icon()
                }
            },
            actions = {
                Icon(
                    Icons.Rounded.Search,
                    contentDescription = null,
                    tint = MaterialTheme.colors.onBackground,
                    modifier = Modifier.padding(8.dp).size(24.dp),
                )
            },
            elevation = 0.dp,
            backgroundColor = Color.Transparent,
            contentColor = MaterialTheme.colors.onBackground,
        )
    }
}

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
        fadeIn(tween(500)) with fadeOut(tween(1000))
    }) {
        LazyVerticalGrid(
            modifier = Modifier.fillMaxSize(),
            columns = GridCells.Fixed(2),
        ) {

            if (it is HomeState.Loading) {
                item(span = { GridItemSpan(this.maxLineSpan) }) {
                    LinearProgressIndicator(
                        modifier = Modifier
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
                        HorizontalPager(state = pagerState, modifier = Modifier.fillMaxWidth()) {
                            val new = get(it)
                            new.run {
                                CardItem(title, description, thumbnailURL) {
                                    CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.News, navController)
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
                        LazyRow {
                            items(size) {
                                val event = get(it)
                                event.run {
                                    EventCard(title, description, date, thumbnailURL) {
                                        CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Events, navController)
                                    }
                                }
                            }
                        }
                    }
                }
                it.page.discoveryCards.run {
                    item(span = { GridItemSpan((this.maxLineSpan)) }) {
                        ListHeader("Curiosidades") {
                            CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Discovery,
                                navController
                            )
                        }
                    }
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        LazyRow {
                            items(count = size) { index ->
                                val card = get(index)
                                card.run {
                                    ExploreCard(title, description, thumbnailURL, modifier = Modifier.clickable {
                                        CosmosApp.Navigation.navigateTo(CosmosApp.Navigation.Pages.Discovery, navController)
                                    })
                                }
                            }
                        }
                    }
                }
                it.page.educationCard.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        EducationCard(title, description, thumbnailURL)
                    }
                }
                it.page.gallery.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        ListHeader("Galeria")
                    }
                    items(count = size) { index ->
                        val gallery = get(index)
                        gallery.run {
                            GalleryCard(title, description, thumbnailURL)
                        }
                    }
                }
            }
        }
    }


}

