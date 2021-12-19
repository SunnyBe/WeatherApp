package com.sundayndu.weatherapp.data.repository

import com.sundayndu.weatherapp.data.model.WeatherResponse
import com.sundayndu.weatherapp.data.network.WeatherNetworkService
import com.sundayndu.weatherapp.utils.ResultState
import javax.inject.Inject

class WeatherRepoImpl @Inject constructor(
    private val apiService: WeatherNetworkService
//    private val cacheService: WeatherDatabase
): WeatherRepository {

    override suspend fun fetchWeather(location: String): ResultState<WeatherResponse> {
        return try {
            val weatherResp = apiService.fetchWeather(location = location)
            ResultState.Success(weatherResp)
        } catch (ex: Throwable) {
            ResultState.Error(ex)
        }
    }
}