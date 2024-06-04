package features.news.presentation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import features.news.data.usecase.NewsUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch

class NewsViewModel(val newUseCase: NewsUseCase) : ViewModel() {

    val state = MutableStateFlow<NewsState?>(null)


    fun fetchNews() {
        viewModelScope.launch(Dispatchers.IO) {
            state.value = NewsState.Loading
            try {
                val news = newUseCase.getNews()
                state.emit(NewsState.Success(news.success.data))
            } catch (e: Exception) {
                state.value = NewsState.Error
            }
        }
    }
}