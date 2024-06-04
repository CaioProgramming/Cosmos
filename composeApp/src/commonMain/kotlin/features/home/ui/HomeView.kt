@file:OptIn(ExperimentalFoundationApi::class)

package features.home.ui

import LocalNavController
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.animation.core.FastOutLinearInEasing
import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.KeyboardArrowRight
import androidx.compose.material.icons.rounded.Search
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import animations.createGradientAnimation
import com.chrynan.colors.Color
import com.chrynan.colors.compose.toComposeColor
import features.home.presentation.HomeState
import features.home.presentation.HomeViewModel
import features.home.ui.components.CardItem
import features.home.ui.components.EducationCard
import features.home.ui.components.ExploreCard
import features.home.ui.components.GalleryCard
import features.home.ui.components.ImageCard
import features.news.ui.NewsPage
import org.koin.compose.koinInject
import theme.CosmosIcon
import theme.getAppColors
import utils.DateFormats
import utils.getFormatted

object HomePage {
    val tag = "HomePage"
}

@Composable
fun HomeView(
    viewModel: HomeViewModel = koinInject(),
    navController: NavController = LocalNavController.current,
) {
    val state = viewModel.state.collectAsState().value
    LazyVerticalGrid(
        modifier = Modifier.animateContentSize(tween(500)).fillMaxSize(),
        columns = GridCells.Fixed(2),
    ) {
        item(span = { GridItemSpan(this.maxLineSpan) }) {
            HomeAppBar(state == HomeState.Loading)
        }

        item(span = { GridItemSpan(this.maxLineSpan) }) {
            AnimatedVisibility(visible = state != HomeState.Loading && state != null, enter = fadeIn(), exit = fadeOut()) {
                Text(
                    text = DateFormats.DATE_DAY_OF_MONTH_YEAR.getFormatted(),
                    style = MaterialTheme.typography.h6.copy(fontWeight = FontWeight.W800),
                    modifier = Modifier.padding(16.dp),
                )
            }
        }

        if (state is HomeState.Success) {
            state.page.run {
                item(span = { GridItemSpan(this.maxLineSpan) }) {
                    Row(
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier.clickable {
                            navController.navigate(NewsPage.tag)
                        }.fillMaxWidth(),
                    ) {
                        Text(
                            "Últimas notícias",
                            style = MaterialTheme.typography.h5,
                            modifier = Modifier.padding(16.dp),
                            textAlign = TextAlign.Start,
                        )
                        Icon(
                            Icons.AutoMirrored.Rounded.KeyboardArrowRight,
                            contentDescription = null,
                            tint = MaterialTheme.colors.onBackground,
                            modifier = Modifier.padding(horizontal = 8.dp),
                        )
                    }
                }
                item(span = { GridItemSpan(this.maxLineSpan) }) {
                    val pagerState = rememberPagerState(pageCount = { latestNews.size })
                    HorizontalPager(state = pagerState, modifier = Modifier.fillMaxWidth()) {
                        val new = latestNews.get(it)
                        new.run {
                            CardItem(title, description, thumbnailURL) {
                                navController.navigate(NewsPage.tag)
                            }
                        }
                    }
                }
                dayPic.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        ImageCard(
                            title = title,
                            url = thumbnailURL,
                            description = description,
                        )
                    }
                }
                discoveryCards.run {
                    item(span = { GridItemSpan((this.maxLineSpan))}) {
                        Text(
                            "Curiosidades",
                            style = MaterialTheme.typography.h5,
                            modifier = Modifier.padding(16.dp),
                            textAlign = TextAlign.Start,
                        )
                    }
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        LazyRow {
                            items(count = size) { index ->
                                val card = get(index)
                                card.run {
                                    ExploreCard(title, description, thumbnailURL)
                                }
                            }
                        }
                    }
                }
                educationCard.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        EducationCard(title, description, thumbnailURL)
                    }
                }
                gallery.run {
                    item(span = { GridItemSpan(this.maxLineSpan) }) {
                        Text(
                            "Galeria",
                            style = MaterialTheme.typography.h5,
                            modifier = Modifier.padding(16.dp),
                            textAlign = TextAlign.Start)
                    }
                    items(size) {
                        val item = get(it)
                        GalleryCard(item.title, item.description, item.thumbnailURL)
                    }
                }
            }
        }
    }

    LaunchedEffect(Unit) {
        viewModel.fetchHomePage()
    }
}

@Composable
fun HomeAppBar(animating: Boolean = false) {
    TopAppBar(
        backgroundColor = Color.Transparent.toComposeColor(),
        navigationIcon = {
            val sizeAnimation =
                animateDpAsState(
                    if (animating) 32.dp else 24.dp,
                    tween(1000, easing = FastOutLinearInEasing),
                )

            val iconModifier =
                if (animating) {
                    Modifier.createGradientAnimation(getAppColors())
                } else {
                    Modifier.padding(0.dp)
                }
            CosmosIcon(modifier = iconModifier.padding(horizontal = 16.dp).size(sizeAnimation.value))
        },
        actions = {
            Icon(
                Icons.Rounded.Search,
                contentDescription = null,
                tint = MaterialTheme.colors.onBackground,
                modifier = Modifier.padding(horizontal = 16.dp),
            )
        },
        title = {},
        elevation = 0.dp,
        contentColor = MaterialTheme.colors.onBackground,
    )
}
