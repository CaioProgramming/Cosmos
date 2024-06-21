package features.education.data.usecase

import features.education.data.model.PlanetsResponse
import features.education.data.service.PlanetsService
import service.ServiceResult

class PlanetsUseCaseImpl(val planetsService: PlanetsService) : PlanetsUseCase {
    override suspend fun getPlanets(): ServiceResult<Exception, PlanetsResponse> = planetsService.getPlanets()
}