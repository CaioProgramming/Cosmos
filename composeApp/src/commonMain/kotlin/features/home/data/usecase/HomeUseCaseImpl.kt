package features.home.data.usecase

import features.home.data.model.HomePage
import features.home.data.service.HomeService
import service.ServiceResult

class HomeUseCaseImpl(private val homeService: HomeService) : HomeUseCase {
    override suspend fun fetchHomePage() = homeService.fetchHomePage()
}