package service

import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.call.receive
import io.ktor.client.request.get
import io.ktor.util.logging.KtorSimpleLogger
import io.ktor.util.logging.Logger

abstract class BaseService {
    abstract val serviceURL: String
    val client = HttpClient()
    suspend inline fun <reified T> makeRequest(endpoint: String = emptyString()) : ServiceResult<Exception, T> {
        val url = buildURL(endpoint)

        try {
            val request = client.get(url)
            logRequest("requesting $url")
            return ServiceResult.Success(request.body<T>())
        } catch (e: Exception) {
            logError("Error requesting\n$url\n${e.message}\n")
            e.printStackTrace()
            return ServiceResult.Error(e)
        }
    }

    fun logRequest(message: String) {
        KtorSimpleLogger(this::class.simpleName ?: "CosmosLogger")
            .info(message)

    }

    fun logError(message: String) {
        KtorSimpleLogger(this::class.simpleName ?: "CosmosLogger")
            .error(message)
    }

    fun buildURL(endpoint: String) = serviceURL.appendQuery(endpoint)

    private fun String.appendQuery(query: String) = this.plus("?$query")

}



fun emptyString() = String()

sealed class ServiceResult<out L, out R> {

    data class Error<out L>(val exception: Exception) : ServiceResult<L, Nothing>()

    data class Success<out R>(val data: R) : ServiceResult<Nothing, R>()

    val isSuccess get() = this is Success<R>

    val isError get() = this is Error<L>

    val success get() = this as Success
    val error get() = this as Error

}