package features.events.di

import features.events.data.service.EventService
import features.events.data.service.EventServiceMockImpl
import features.events.data.usecase.EventUseCase
import features.events.data.usecase.EventUseCaseImpl
import features.events.presentation.EventViewModel
import features.events.ui.EventView
import org.koin.dsl.module

object EventModule {
    fun modules() = module {

        factory<EventService> { EventServiceMockImpl(get()) }
        factory<EventUseCase> { EventUseCaseImpl(get()) }
        factory { EventViewModel(get()) }
    }
}