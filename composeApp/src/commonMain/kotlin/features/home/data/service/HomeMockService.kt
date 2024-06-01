package features.home.data.service

import com.ilustris.cosmos.resources.Res
import features.home.data.model.HomePage
import kotlinx.serialization.json.Json
import org.jetbrains.compose.resources.ExperimentalResourceApi
import service.ServiceResult

@OptIn(ExperimentalResourceApi::class)
class HomeMockService : HomeService {

   override suspend fun fetchHomePage(): ServiceResult<Exception, HomePage> {
       return try {
           val file = Res.readBytes(mockPath).decodeToString()
           val homePage = Json.decodeFromString<HomePage>(file)
           ServiceResult.Success(homePage)
       } catch (e: Exception) {
           e.printStackTrace()
           ServiceResult.Error(e)
       }
   }

}

private const val mockPath = "files/home_sample.json"