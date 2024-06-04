package features.news.di

import androidx.compose.runtime.Composable
import features.news.data.service.NewsMockServiceImpl
import features.news.data.service.NewsService
import features.news.data.usecase.NewsUseCase
import features.news.data.usecase.NewsUseCaseImpl
import features.news.details.di.NewsDetailsModule
import features.news.presentation.NewsViewModel
import org.koin.dsl.module
import utils.MockHelper

object NewsModule {

    @Composable
    fun modules() = module {

        single { MockHelper() }
        factory<NewsService> { NewsMockServiceImpl(get()) }
        factory<NewsUseCase> { NewsUseCaseImpl(get()) }
        factory { NewsViewModel(get()) }
    }

}