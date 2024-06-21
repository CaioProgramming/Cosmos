package features.education.data.service

import features.education.data.model.PlanetsResponse
import service.ServiceResult
import utils.MockHelper

class PlanetsServiceMockImpl(private val mockHelper: MockHelper) : PlanetsService {
    override suspend fun getPlanets(): ServiceResult<Exception, PlanetsResponse> = mockHelper.requestMock(PLANETS_FILE)
}

private const val PLANETS_FILE = "planets_sample"