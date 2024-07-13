package features.discovery.presentation

import features.discovery.model.data.Discovery

sealed class DiscoveryState {
    object Loading : DiscoveryState()
    data class Success(val data: List<Discovery>) : DiscoveryState()
    data class Error(val message: String) : DiscoveryState()
}