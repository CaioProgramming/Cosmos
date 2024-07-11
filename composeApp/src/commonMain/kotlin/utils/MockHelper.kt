@file:OptIn(ExperimentalResourceApi::class, ExperimentalResourceApi::class)

package utils

import com.ilustris.cosmos.resources.Res
import kotlinx.serialization.json.Json
import org.jetbrains.compose.resources.ExperimentalResourceApi
import service.ServiceResult

@OptIn(ExperimentalResourceApi::class)
class MockHelper {

    suspend inline fun <reified T> requestMock(fileName: String): ServiceResult<Exception, T> {
        try {
            val data = Res.readBytes(buildPath(fileName)).decodeToString()
            val response = Json.decodeFromString<T>(data)
            return ServiceResult.Success(response)
        } catch (e: Exception) {
            e.printStackTrace()
            return ServiceResult.Error(e)
        }
    }

}

private const val rootPath = "files"
private const val extension = ".json"
fun buildPath(fileName: String) = "$rootPath/$fileName$extension"
