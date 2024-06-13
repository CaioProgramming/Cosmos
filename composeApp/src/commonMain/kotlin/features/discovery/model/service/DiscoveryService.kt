package features.discovery.model.service

import features.discovery.model.data.DiscoveryResponse
import service.ServiceResult

interface DiscoveryService {
    suspend fun getDiscovery(): ServiceResult<Exception, DiscoveryResponse>
}