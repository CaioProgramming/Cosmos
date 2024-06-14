package features.discovery.model.usecase

import features.discovery.model.data.Discovery
import features.discovery.model.data.DiscoveryResponse
import service.ServiceResult

interface DiscoveryUseCase {
    suspend fun getDiscovery(): ServiceResult<Exception, DiscoveryResponse>

    suspend fun getDiscoveryDetail(id: Int?): ServiceResult<Exception, Discovery>
}