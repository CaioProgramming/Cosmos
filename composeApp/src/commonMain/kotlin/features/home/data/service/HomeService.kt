package features.home.data.service

import features.home.data.model.HomePage
import service.ServiceResult

interface HomeService {
    suspend fun fetchHomePage(): ServiceResult<Exception, HomePage>
}