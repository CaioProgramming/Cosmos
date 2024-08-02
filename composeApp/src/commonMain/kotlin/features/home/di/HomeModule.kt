package features.home.di

import androidx.compose.runtime.Composable
import features.home.data.service.HomeMockServiceImpl
import features.home.data.service.HomeService
import features.home.data.usecase.HomeUseCase
import features.home.data.usecase.HomeUseCaseImpl
import features.home.presentation.HomeViewModel
import org.koin.dsl.module

object HomeModule {
    @Composable
    fun modules() =
        module {
            factory<HomeService> { HomeMockServiceImpl(get()) }
            factory<HomeUseCase> { HomeUseCaseImpl(homeService = get()) }

            factory { HomeViewModel(get()) }
        }
}
