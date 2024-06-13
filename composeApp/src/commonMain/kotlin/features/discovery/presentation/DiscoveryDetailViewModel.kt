package features.discovery.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import features.discovery.model.usecase.DiscoveryUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import service.ServiceResult

class DiscoveryDetailViewModel(private val discoveryUseCase: DiscoveryUseCase) : ViewModel() {

    val state = MutableStateFlow<DiscoveryDetailState?>(null)

    fun getDiscoveryDetail(id: Int?) {
        state.value = DiscoveryDetailState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            discoveryUseCase.getDiscoveryDetail(id).let { result ->
                when (result) {
                    is ServiceResult.Success -> {
                        state.value = DiscoveryDetailState.Success(result.data)
                    }
                    is ServiceResult.Error -> {
                        state.value = DiscoveryDetailState.Error(result.exception.message ?: "Error")
                    }
                }
            }
        }

    }

}