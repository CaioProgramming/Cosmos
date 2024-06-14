package features.discovery.model.data

import kotlinx.serialization.Serializable

@Serializable
data class DiscoveryResponse(val curiosities: List<Discovery>)