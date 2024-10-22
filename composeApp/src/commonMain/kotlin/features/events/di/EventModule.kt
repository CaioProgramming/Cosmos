package features.events.di

import features.events.data.service.EventService
import features.events.data.service.EventServiceImpl
import features.events.data.usecase.EventUseCase
import features.events.data.usecase.EventUseCaseImpl
import features.events.presentation.EventViewModel
import org.koin.dsl.module

object EventModule {
    fun modules() =
        module {
            factory<EventService> { EventServiceImpl() }
            factory<EventUseCase> { EventUseCaseImpl(get()) }
            factory { EventViewModel(get()) }
        }
}
