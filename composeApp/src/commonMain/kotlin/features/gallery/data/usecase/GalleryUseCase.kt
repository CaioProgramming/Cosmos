package features.gallery.data.usecase

import features.gallery.data.model.GalleryCollection
import features.home.data.model.DefaultCard
import service.ServiceResult

interface GalleryUseCase {
    suspend fun fetchGallery(): ServiceResult<Exception, List<GalleryCollection>>
}