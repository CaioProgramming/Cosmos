package features.home.data.model

import kotlinx.serialization.Serializable

@Serializable
data class HomePage(
    val latestNews: List<DefaultCard>,
    val dayPic: DefaultCard,
    val discoveryCards: List<DefaultCard>,
    val educationCard: DefaultCard,
    val gallery: List<DefaultCard>,

)

@Serializable
data class DefaultCard(
    val title: String,
    val thumbnailURL: String,
    val description: String,
)