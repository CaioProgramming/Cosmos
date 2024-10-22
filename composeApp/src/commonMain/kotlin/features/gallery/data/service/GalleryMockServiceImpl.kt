package features.gallery.data.service

import features.gallery.data.model.GalleryResponse
import service.ServiceResult
import utils.MockHelper

class GalleryMockServiceImpl(
    private val mockHelper: MockHelper,
) : GalleryService {
    override suspend fun fetchGallery(): ServiceResult<Exception, GalleryResponse> = mockHelper.requestMock("gallery_sample")
}
