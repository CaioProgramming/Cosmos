package features.news.di

import androidx.compose.runtime.Composable
import features.news.data.service.NewsService
import features.news.data.service.NewsServiceImpl
import features.news.data.usecase.NewsUseCase
import features.news.data.usecase.NewsUseCaseImpl
import features.news.presentation.NewsViewModel
import org.koin.dsl.module

object NewsModule {
    @Composable
    fun modules() =
        module {
            factory<NewsService> { NewsServiceImpl() }
            factory<NewsUseCase> { NewsUseCaseImpl(get()) }
            factory { NewsViewModel(get()) }
        }
}
