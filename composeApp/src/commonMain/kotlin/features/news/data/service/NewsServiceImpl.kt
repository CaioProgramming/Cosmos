package features.news.data.service

import features.news.data.model.NewsData
import service.BaseService
import service.ServiceResult

class NewsServiceImpl :
    BaseService(),
    NewsService {
    override suspend fun getNews(): ServiceResult<Exception, NewsData> = makeRequest<NewsData>("news.json")
}
