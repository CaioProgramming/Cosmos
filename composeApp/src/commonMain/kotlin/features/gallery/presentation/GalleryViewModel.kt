package features.gallery.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import features.gallery.data.usecase.GalleryUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class GalleryViewModel(private val galleryUseCase: GalleryUseCase) : ViewModel() {

    val state: MutableStateFlow<GalleryState?> = MutableStateFlow(null)

    fun fetchGallery() {
        state.value = GalleryState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            try {
                val gallery = galleryUseCase.fetchGallery()
                state.value = GalleryState.Success(gallery.success.data)
            } catch (e: Exception) {
                state.value = GalleryState.Error(e.message ?: "An error occurred")
            }
        }
    }
}