@file:OptIn(ExperimentalFoundationApi::class, ExperimentalFoundationApi::class)

package features.news.ui

import LocalNavController
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import animations.createGradientAnimation
import features.news.presentation.NewsState
import features.news.presentation.NewsViewModel
import features.news.ui.components.newsCardPager
import org.koin.compose.koinInject
import theme.CosmosApp

object NewsPage {
    val tag = "NewsPage"
}

@Composable
fun NewsView() {
    NewsList()
}

@Composable
fun NewsList(viewModel: NewsViewModel = koinInject()) {
    val state = viewModel.state.collectAsState(null).value
    val rootNavController: NavController = LocalNavController.current
    when (state) {
        NewsState.Error ->
            Box(modifier = Modifier.fillMaxSize()) {
                Text(
                    "Ocorreu um erro inesperado ao carregar as notícias",
                    style = MaterialTheme.typography.h6,
                    modifier = Modifier.padding(16.dp),
                )
            }
        NewsState.Loading ->
            Box(modifier = Modifier.fillMaxSize()) {
                CosmosApp.Resources.largeIcon(
                    modifier =
                        Modifier
                            .align(Alignment.Center)
                            .createGradientAnimation(),
                )
            }
        is NewsState.Success -> {
            LazyColumn {
                val news = state.newsData.news
                items(news.size) {
                    newsCardPager(news[it].pages, news[it].reference)
                }
            }
        }
        null -> Box(Modifier.size(0.dp))
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
