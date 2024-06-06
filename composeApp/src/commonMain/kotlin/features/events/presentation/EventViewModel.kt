package features.events.presentation

import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import features.events.data.usecase.EventUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import service.ServiceResult

class EventViewModel(val useCase: EventUseCase) : ViewModel() {

    val state = MutableStateFlow<EventState?>(null)

    fun getEvents() {
        state.value = EventState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            val request = useCase.getEvents()
            when (request) {
                is ServiceResult.Success -> {
                    state.value = EventState.Success(request.data.events)
                }
                is ServiceResult.Error -> {
                    state.value = EventState.Error(request.exception.message ?: "Error")
                }
            }
        }
    }

}