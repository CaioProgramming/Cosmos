package di

import androidx.compose.runtime.Composable
import features.home.di.HomeModule
import features.news.di.NewsModule

object CommonModule {
    @Composable
    fun fetchModules() =
        listOf(
            HomeModule.modules(),
            NewsModule.modules()
        )
}
