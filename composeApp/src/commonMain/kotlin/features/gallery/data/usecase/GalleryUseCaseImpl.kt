package features.gallery.data.usecase

import features.gallery.data.model.GalleryCollection
import features.gallery.data.service.GalleryService
import features.home.data.model.DefaultCard
import service.ServiceResult

class GalleryUseCaseImpl(private val galleryService: GalleryService) : GalleryUseCase {
    override suspend fun fetchGallery(): ServiceResult<Exception, List<GalleryCollection>> {
        try {
            val response = galleryService.fetchGallery()
            return ServiceResult.Success(response.success.data.collections)
        } catch (e: Exception) {
            print("Error fetching gallery cause => ${e.message} ${e.cause?.message}")
            e.printStackTrace()
            return ServiceResult.Error(e)
        }
    }
}