package features.home.data.model

import features.discovery.model.data.Discovery
import features.events.data.model.EventData
import kotlinx.serialization.Serializable

@Serializable
data class HomePage(
    val latestNews: List<DefaultCard>,
    val events: List<EventData>,
    val discoveryCards: List<Discovery>,
    val educationCard: DefaultCard,
    val gallery: List<DefaultCard>,

)

@Serializable
data class DefaultCard(
    val title: String,
    val thumbnailURL: String,
    val description: String,
)