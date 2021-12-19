package com.sundayndu.weatherapp.data.model

data class WeatherResponse(
    val cod: String,
    val message: Long,
    val cnt: Long,
    val list: List<WeatherListItem>,
    val city: City
)