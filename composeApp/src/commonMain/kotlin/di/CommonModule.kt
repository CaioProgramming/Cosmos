package di

import androidx.compose.runtime.Composable
import features.discovery.di.DiscoveryModule
import features.discovery.model.data.Discovery
import features.education.di.EducationModule
import features.events.di.EventModule
import features.gallery.di.GalleryModule
import features.home.di.HomeModule
import features.news.di.NewsModule
import org.koin.dsl.module
import utils.MockHelper

object CommonModule {
    @Composable
    fun fetchModules() =
        listOf(
            HelperModule.modules(),
            HomeModule.modules(),
            NewsModule.modules(),
            EventModule.modules(),
            DiscoveryModule.modules(),
            EducationModule.module(),
            GalleryModule.modules()
        )
}

object HelperModule {
    fun modules() = module {
        single { MockHelper() }
    }
}