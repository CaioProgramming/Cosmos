package features.education.data.service

import features.education.data.model.EducationResponse
import service.ServiceResult

interface PlanetsService {
    suspend fun getPlanets(): ServiceResult<Exception, EducationResponse>
}
