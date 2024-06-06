package features.events.data.usecase

import features.events.data.model.EventData
import features.events.data.model.EventResponse
import service.ServiceResult

interface EventUseCase {

    suspend fun getEvents(): ServiceResult<Exception,EventResponse>
}