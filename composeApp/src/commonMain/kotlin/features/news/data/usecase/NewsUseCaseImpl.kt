package features.news.data.usecase

import features.news.data.model.NewsData
import features.news.data.service.NewsService
import service.ServiceResult

class NewsUseCaseImpl(val newsService: NewsService) : NewsUseCase {
   override suspend fun getNews(): ServiceResult<Exception, NewsData> = newsService.getNews()

}