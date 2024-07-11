package features.gallery.data.model

import features.home.data.model.DefaultCard
import kotlinx.serialization.Serializable

@Serializable
data class GalleryResponse(
    val collections: List<GalleryCollection>
)
@Serializable
data class GalleryCollection(
    val title: String,
    val description: String,
    val items: List<DefaultCard>
)