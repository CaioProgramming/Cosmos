package features.home.presentation

import features.home.data.model.HomePage

sealed class HomeState {

    object Error : HomeState()
    object Loading : HomeState()
    data class Success(val page: HomePage) : HomeState()

}