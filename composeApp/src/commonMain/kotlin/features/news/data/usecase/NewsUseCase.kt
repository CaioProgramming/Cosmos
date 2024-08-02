package features.news.data.usecase

import features.news.data.model.NewsData
import features.news.data.model.NewsInfo
import service.ServiceResult

interface NewsUseCase {
    suspend fun getNews(): ServiceResult<Exception, NewsData>

    suspend fun getNew(id: String): ServiceResult<Exception, NewsInfo>
}
