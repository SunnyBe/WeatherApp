package com.sundayndu.weatherapp.utils

import com.sundayndu.weatherapp.data.model.*

object TestEntities {
    val weather = Weather(
        id = 10,
        main = "Something",
        description = "description",
        icon = "10n"
    )
    val weatherItemList = WeatherListItem(
        dt = 1,
        main = Main(
            temp = 25.0,
            pressure = 1,
            tempKf = 10.4,
            tempMax = 20.4,
            tempMin = 20.0,
            humidity = 30
        ),
        weather = listOf(weather),
        dateText = "2021-12-21 12:00:00"
    )

    val cityTest = City(
        id = 2950159,
        name = "Berlin",
        country = "DE",
        population = 1002,
        timezone = 3600,
        sunrise = 1639638709,
        sunset = 1639638709
    )
    val weatherResponse = WeatherResponse(
        cod = "200",
        message = 0,
        cnt = 40,
        list = listOf(weatherItemList),
        city = cityTest
    )
}