package com.sundayndu.weatherapp.data.network

import com.sundayndu.weatherapp.data.model.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface WeatherNetworkService {

    @GET("forecast")
    suspend fun fetchWeather(@Query("q") location: String): WeatherResponse
}