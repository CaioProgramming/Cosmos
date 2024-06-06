package di

import androidx.compose.runtime.Composable
import features.events.di.EventModule
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
        )
}

object HelperModule {
    fun modules() = module {
        single { MockHelper() }
    }
}