package features.gallery.data.service

import features.gallery.data.model.GalleryResponse
import features.home.data.model.DefaultCard
import service.ServiceResult

interface GalleryService {
    suspend fun fetchGallery(): ServiceResult<Exception,GalleryResponse>
}