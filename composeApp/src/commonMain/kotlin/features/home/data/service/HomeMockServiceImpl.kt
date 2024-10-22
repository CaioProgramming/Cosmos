package features.home.data.service

import features.home.data.model.HomePage
import org.jetbrains.compose.resources.ExperimentalResourceApi
import service.ServiceResult
import utils.MockHelper

@OptIn(ExperimentalResourceApi::class)
class HomeMockServiceImpl(
    private val mockHelper: MockHelper,
) : HomeService {
    override suspend fun fetchHomePage(): ServiceResult<Exception, HomePage> = mockHelper.requestMock(HOME_MOCK_PATH)
}

private const val HOME_MOCK_PATH = "home_sample"
