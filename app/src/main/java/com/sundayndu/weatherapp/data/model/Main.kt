package com.sundayndu.weatherapp.data.model

import com.google.gson.annotations.SerializedName

data class Main(
    val temp: Double,
    val pressure: Long,
    @SerializedName("temp_min")
    val tempMin: Double,
    @SerializedName("temp_max")
    val tempMax: Double,
    val humidity: Long,
    @SerializedName("temp_kf")
    val tempKf: Double
)