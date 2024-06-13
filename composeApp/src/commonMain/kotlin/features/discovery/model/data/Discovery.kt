package features.discovery.model.data

import kotlinx.serialization.Serializable

@Serializable
data class Discovery(
    val id: Int,
    val title: String,
    val callOut: String,
    val description: String,
    val thumbnailURL: String
)
