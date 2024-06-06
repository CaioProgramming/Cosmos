package features.events.data.model

import kotlinx.serialization.Serializable

@Serializable
data class EventData(
    val date: String,
    val description: String,
    val thumbnailURL: String,
    val title: String,
    val visiblePlaces: List<String>,
    val extraInfo: List<String>
)


@Serializable
data class EventResponse(
    val events: List<EventData>)