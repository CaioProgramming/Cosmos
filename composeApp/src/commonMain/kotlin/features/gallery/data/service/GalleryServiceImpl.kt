package features.gallery.data.service

import features.gallery.data.model.GalleryResponse
import service.BaseService
import service.ServiceResult

class GalleryServiceImpl :
    BaseService(),
    GalleryService {
    override suspend fun fetchGallery(): ServiceResult<Exception, GalleryResponse> = makeRequest("gallery.json")
}
