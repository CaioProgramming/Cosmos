package features.education.data.usecase

import features.education.data.model.EducationResponse
import service.ServiceResult

interface PlanetsUseCase {

   suspend fun getPlanets() : ServiceResult<Exception, EducationResponse>

}