package com.sundayndu.weatherapp.data.model

data class City(
    val id: Long,
    val name: String,
    val country: String,
    val population: Long,
    val timezone: Long,
    val sunrise: Long,
    val sunset: Long
)

/*
"city": {
    "id": 2950159,
    "name": "Berlin",
    "coord": {
        "lat": 52.5244,
        "lon": 13.4105
    },
 */