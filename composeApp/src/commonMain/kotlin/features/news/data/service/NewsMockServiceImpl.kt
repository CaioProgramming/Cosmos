@file:OptIn(ExperimentalResourceApi::class)

package features.news.data.service

import features.news.data.model.NewsData
import org.jetbrains.compose.resources.ExperimentalResourceApi
import service.ServiceResult
import utils.MockHelper

class NewsMockServiceImpl(private val mockHelper: MockHelper) : NewsService {
    override suspend fun getNews(): ServiceResult<Exception, NewsData> = mockHelper.requestMock(NEWS_MOCK_PATH)
}

private const val NEWS_MOCK_PATH = "news_sample"
