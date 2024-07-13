package features.events.data.service

import features.events.data.model.EventData
import features.events.data.model.EventResponse
import service.ServiceResult
import utils.MockHelper

class EventServiceMockImpl(val mockHelper: MockHelper) : EventService {
    override suspend fun getEvents(): ServiceResult<Exception, EventResponse> = mockHelper.requestMock(eventsFile)
}

private const val eventsFile = "events_sample"