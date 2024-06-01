package features.home.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import features.home.data.usecase.HomeUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class HomeViewModel(private val homeUseCase: HomeUseCase): ViewModel() {

    val state = MutableStateFlow<HomeState?>(null)

    fun fetchHomePage() {
        viewModelScope.launch(Dispatchers.IO) {

            state.value = HomeState.Loading
            delay(2000)
            try {
                val homePage = homeUseCase.fetchHomePage()
                state.emit(HomeState.Success(homePage.success.data))
            } catch (e: Exception) {
                state.value = HomeState.Error
            }
        }
    }

}