package features.discovery.di

import features.discovery.model.service.DiscoveryMockServiceImpl
import features.discovery.model.service.DiscoveryService
import features.discovery.model.usecase.DiscoveryUseCase
import features.discovery.model.usecase.DiscoveryUseCaseImpl
import features.discovery.presentation.DiscoveryDetailViewModel
import features.discovery.presentation.DiscoveryViewModel
import org.koin.dsl.module

object DiscoveryModule {

    fun modules() = module {
        factory<DiscoveryService> { DiscoveryMockServiceImpl(get()) }
        factory<DiscoveryUseCase> { DiscoveryUseCaseImpl(get()) }
        factory<DiscoveryViewModel> { DiscoveryViewModel(get()) }
        factory<DiscoveryDetailViewModel> { DiscoveryDetailViewModel(get()) }
    }
}