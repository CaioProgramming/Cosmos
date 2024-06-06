package features.events.presentation

import features.events.data.model.EventData

sealed class EventState {
    object Loading : EventState()
    data class Success(val events: List<EventData>) : EventState()
    data class Error(val message: String) : EventState()
}