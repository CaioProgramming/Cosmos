package features.events.data.service

import features.events.data.model.EventData
import features.events.data.model.EventResponse
import service.ServiceResult

interface EventService {
    suspend fun getEvents(): ServiceResult<Exception, EventResponse>
}