package features.education.data.service

import features.education.data.model.EducationResponse
import service.BaseService
import service.ServiceResult

class PlanetsServiceImpl :
    BaseService(),
    PlanetsService {
    override suspend fun getPlanets(): ServiceResult<Exception, EducationResponse> = makeRequest("planets.json")
}
