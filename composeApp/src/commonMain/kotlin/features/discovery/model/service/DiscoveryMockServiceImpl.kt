package features.discovery.model.service

import features.discovery.model.data.DiscoveryResponse
import service.ServiceResult
import utils.MockHelper

class DiscoveryMockServiceImpl(private val mockHelper: MockHelper) : DiscoveryService {
    override suspend fun getDiscovery(): ServiceResult<Exception, DiscoveryResponse> =
        mockHelper.requestMock<DiscoveryResponse>(
            FILE_PATH,
        )
}
private const val FILE_PATH = "discovery_sample"
