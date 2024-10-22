package features.education.di

import features.education.data.service.PlanetsService
import features.education.data.service.PlanetsServiceImpl
import features.education.data.usecase.PlanetsUseCase
import features.education.data.usecase.PlanetsUseCaseImpl
import features.education.presentation.PlanetsViewModel
import org.koin.dsl.module

object EducationModule {
    fun module() =
        module {
            factory<PlanetsService> { PlanetsServiceImpl() }
            factory<PlanetsUseCase> { PlanetsUseCaseImpl(get()) }
            factory { PlanetsViewModel(get()) }
        }
}
