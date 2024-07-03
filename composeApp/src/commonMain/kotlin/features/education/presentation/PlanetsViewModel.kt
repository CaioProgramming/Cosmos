package features.education.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import features.education.data.usecase.PlanetsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch
import service.ServiceResult

class PlanetsViewModel(private val planetsUseCase: PlanetsUseCase) : ViewModel() {


    val state = MutableStateFlow<PlanetsState?> (null)

    fun getPlanets() {
        state.value = PlanetsState.Loading
        viewModelScope.launch(Dispatchers.IO) {
            when (val result = planetsUseCase.getPlanets()) {
                is ServiceResult.Success -> {
                    state.value = PlanetsState.Success(result.data.planets, result.data.constellations)
                }
                is ServiceResult.Error -> {
                    state.value = PlanetsState.Error(result.exception.message ?: "An error occurred")
                }
            }
        }
    }
}