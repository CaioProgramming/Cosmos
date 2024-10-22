package features.news.data.usecase

import features.news.data.model.NewsData
import features.news.data.model.NewsInfo
import features.news.data.service.NewsService
import service.ServiceResult

class NewsUseCaseImpl(
    private val newsService: NewsService,
) : NewsUseCase {
    override suspend fun getNews(): ServiceResult<Exception, NewsData> = newsService.getNews()

    override suspend fun getNew(id: String): ServiceResult<Exception, NewsInfo> {
        val news = newsService.getNews()
        try {
            return ServiceResult.Success(
                news.success.data.news
                    .first { it.id == id },
            )
        } catch (e: Exception) {
            e.printStackTrace()
            return ServiceResult.Error(e)
        }
    }
}
