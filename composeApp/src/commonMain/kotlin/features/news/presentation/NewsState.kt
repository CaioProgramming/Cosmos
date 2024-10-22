package features.news.presentation

import features.news.data.model.NewsData
import features.news.data.model.NewsInfo

sealed class NewsState {
    data object Loading : NewsState()

    data object Error : NewsState()

    data class Success(
        val newsData: NewsData,
    ) : NewsState()

    data class DetailSuccess(
        val news: NewsInfo,
    ) : NewsState()
}
