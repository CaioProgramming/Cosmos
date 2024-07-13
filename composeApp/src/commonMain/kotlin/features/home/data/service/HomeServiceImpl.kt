package features.home.data.service

import features.home.data.model.HomePage
import service.BaseService
import service.ServiceResult

class HomeServiceImpl :
    BaseService(),
    HomeService {
    override suspend fun fetchHomePage(): ServiceResult<Exception, HomePage> = makeRequest<HomePage>("home.json")

    override val serviceURL: String = URL_PATH
}

private const val URL_PATH = "https://caioprogramming.github.io/CosmosApp/resources/"
