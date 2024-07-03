package features.education.data.usecase

import features.education.data.model.EducationResponse
import features.education.data.service.PlanetsService
import service.ServiceResult

class PlanetsUseCaseImpl(
    private val planetsService: PlanetsService,
) : PlanetsUseCase {
    override suspend fun getPlanets(): ServiceResult<Exception, EducationResponse> = planetsService.getPlanets()

}
