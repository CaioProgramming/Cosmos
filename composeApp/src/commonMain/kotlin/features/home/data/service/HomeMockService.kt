package features.home.data.service

import com.ilustris.cosmos.resources.Res
import features.home.data.model.HomePage
import kotlinx.serialization.json.Json
import org.jetbrains.compose.resources.ExperimentalResourceApi
import service.ServiceResult
import utils.MockHelper

@OptIn(ExperimentalResourceApi::class)
class HomeMockService(private val mockHelper: MockHelper) : HomeService {

   override suspend fun fetchHomePage(): ServiceResult<Exception, HomePage> = mockHelper.requestMock(mockPath)

}

private const val mockPath = "home_sample"