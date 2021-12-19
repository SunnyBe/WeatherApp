package com.sundayndu.weatherapp.data.repository

import com.sundayndu.weatherapp.data.model.WeatherResponse
import com.sundayndu.weatherapp.utils.ResultState

interface WeatherRepository {
    suspend fun fetchWeather(location: String): ResultState<WeatherResponse>
}