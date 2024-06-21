package features.education.data.service

import features.education.data.model.PlanetsResponse
import service.ServiceResult

interface PlanetsService {

        suspend fun getPlanets() : ServiceResult<Exception, PlanetsResponse>
}