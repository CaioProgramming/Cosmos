package features.events.data.service

import features.events.data.model.EventResponse
import service.BaseService
import service.ServiceResult

class EventServiceImpl :
    BaseService(),
    EventService {
    override suspend fun getEvents(): ServiceResult<Exception, EventResponse> = makeRequest("events.json")
}
