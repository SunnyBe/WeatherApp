package com.sundayndu.weatherapp.data.model

import com.google.gson.annotations.SerializedName

data class WeatherListItem(
    val dt: Long,
    val main: Main,
    val weather: List<Weather>,
    @SerializedName("dt_txt")
    val dateText: String
)