package features.gallery.presentation

import features.gallery.data.model.GalleryCollection
import features.home.data.model.DefaultCard

sealed class GalleryState {
    object Loading : GalleryState()
    data class Error(val message: String) : GalleryState()
    data class Success(val collections: List<GalleryCollection>) : GalleryState()
}