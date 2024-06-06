package features.events.data.usecase

import features.events.data.model.EventData
import features.events.data.model.EventResponse
import features.events.data.service.EventService
import service.ServiceResult

class EventUseCaseImpl(val eventService: EventService) : EventUseCase {
    override suspend fun getEvents(): ServiceResult<Exception, EventResponse> = eventService.getEvents()
}