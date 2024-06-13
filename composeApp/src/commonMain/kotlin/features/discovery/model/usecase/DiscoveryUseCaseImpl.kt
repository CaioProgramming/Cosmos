package features.discovery.model.usecase

import features.discovery.model.data.Discovery
import features.discovery.model.data.DiscoveryResponse
import features.discovery.model.service.DiscoveryService
import service.ServiceResult

class DiscoveryUseCaseImpl(private val discoveryService: DiscoveryService) : DiscoveryUseCase {
    override suspend fun getDiscovery(): ServiceResult<Exception, DiscoveryResponse> =
        discoveryService.getDiscovery()

    override suspend fun getDiscoveryDetail(id: Int?): ServiceResult<Exception, Discovery> {
        discoveryService
            .getDiscovery()
            .success
            .data
            .curiosities
            .find { it.id == id }
            ?.let { return ServiceResult.Success(it) }

        return ServiceResult.Error(Exception("Not found"))

    }
}