package features.discovery.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import features.discovery.model.usecase.DiscoveryUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import service.ServiceResult

class DiscoveryViewModel(private val discoveryUseCase: DiscoveryUseCase) : ViewModel() {

    val state = MutableStateFlow<DiscoveryState?>(null)


    fun getDiscoveryCards() {
        viewModelScope.launch(Dispatchers.IO) {
            state.emit(DiscoveryState.Loading)
            val request = discoveryUseCase.getDiscovery()
            when (request) {
                is ServiceResult.Success -> {
                    state.emit(DiscoveryState.Success(request.data.curiosities))
                }
                is ServiceResult.Error -> {
                    state.emit(DiscoveryState.Error(request.exception.message ?: "Error"))
                }
            }
        }
    }

}