package features.discovery.presentation

import features.discovery.model.data.Discovery

sealed class DiscoveryDetailState {
    object Loading : DiscoveryDetailState()
    data class Success(val data: Discovery) : DiscoveryDetailState()
    data class Error(val message: String) : DiscoveryDetailState()
}