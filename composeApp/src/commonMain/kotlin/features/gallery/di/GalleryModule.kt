package features.gallery.di

import features.gallery.data.service.GalleryMockServiceImpl
import features.gallery.data.service.GalleryService
import features.gallery.data.usecase.GalleryUseCase
import features.gallery.data.usecase.GalleryUseCaseImpl
import features.gallery.presentation.GalleryViewModel
import org.koin.dsl.module

object GalleryModule {


    fun modules() = module {
        factory<GalleryService> { GalleryMockServiceImpl(get()) }
        factory<GalleryUseCase> { GalleryUseCaseImpl(get()) }
        factory { GalleryViewModel(get()) }
    }
}