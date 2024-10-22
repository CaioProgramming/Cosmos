package features.discovery.model.service

import features.discovery.model.data.DiscoveryResponse
import service.BaseService
import service.ServiceResult

class DiscoveryServiceImpl :
    BaseService(),
    DiscoveryService {
    override suspend fun getDiscovery(): ServiceResult<Exception, DiscoveryResponse> = makeRequest("discovery.json")
}
