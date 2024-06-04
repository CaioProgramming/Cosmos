package features.news.data.service

import features.news.data.model.NewsData
import service.ServiceResult

interface NewsService {
   suspend fun getNews(): ServiceResult<Exception, NewsData>
}