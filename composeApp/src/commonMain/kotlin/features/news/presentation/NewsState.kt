package features.news.presentation

import features.news.data.model.NewsData

sealed class NewsState {

    data object Loading: NewsState()
    data object Error: NewsState()
    data class Success(val newsData: NewsData): NewsState()
}