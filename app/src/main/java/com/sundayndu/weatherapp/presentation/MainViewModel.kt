package com.sundayndu.weatherapp.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.sundayndu.weatherapp.data.model.WeatherResponse
import com.sundayndu.weatherapp.data.repository.WeatherRepository
import com.sundayndu.weatherapp.di.qualifier.DefaultDispatcher
import com.sundayndu.weatherapp.utils.ResultState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val weatherRepository: WeatherRepository,
    @DefaultDispatcher private val dispatcher: CoroutineDispatcher
): ViewModel() {

    private val _weatherListResult: MutableLiveData<ResultState<WeatherResponse>> = MutableLiveData()
    val weatherListResult: LiveData<ResultState<WeatherResponse>> get() = _weatherListResult

    fun fetchWeather(location: String) {
        _weatherListResult.postValue(ResultState.Loading())
        viewModelScope.launch(dispatcher) {
            val weatherResp = weatherRepository.fetchWeather(location)
            _weatherListResult.postValue(weatherResp)
        }
    }
}