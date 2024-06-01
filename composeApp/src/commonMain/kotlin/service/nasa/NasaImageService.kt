package service.nasa

import service.BaseService
import service.nasa.model.ImageOfTheDayResponse

class NasaImageService : BaseService() {
    override val serviceURL: String = NASA_IMAGERY_URL

    private val imgOfDayEndPoint = "planetary/apod"
   suspend fun getImageOfTheDay() = makeRequest<ImageOfTheDayResponse>(buildEndpoint())


   private fun appendApiKey() = "?api_key=$API_KEY"

    private fun buildEndpoint() = imgOfDayEndPoint.plus(appendApiKey())
}

private const val NASA_IMAGERY_URL = "https://images-api.nasa.gov"
private const val API_KEY = "C1ujjb1DYVIBE4xIWnLMLlvm2I6whsZYS1hxraI0"