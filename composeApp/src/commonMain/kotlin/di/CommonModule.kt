package di

import androidx.compose.runtime.Composable
import features.home.di.HomeModule
import org.koin.core.context.loadKoinModules
import org.koin.core.module.Module

object CommonModule {

    @Composable
    fun fetchModules() = listOf(HomeModule.modules())
}