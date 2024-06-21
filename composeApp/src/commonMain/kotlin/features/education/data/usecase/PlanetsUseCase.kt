package features.education.data.usecase

import features.education.data.model.PlanetsResponse
import service.ServiceResult

interface PlanetsUseCase {

   suspend fun getPlanets() : ServiceResult<Exception, PlanetsResponse>

}