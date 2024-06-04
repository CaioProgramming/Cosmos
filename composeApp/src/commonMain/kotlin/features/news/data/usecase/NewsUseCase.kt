package features.news.data.usecase

import features.news.data.model.NewsData
import service.ServiceResult

interface NewsUseCase {
    suspend fun getNews(): ServiceResult<Exception, NewsData>

}