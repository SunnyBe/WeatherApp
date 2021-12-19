package com.sundayndu.weatherapp.utils

fun makeUrl(icon: String?): String? {
    return icon?.let {
        "https://openweathermap.org/img/wn/$icon@2x.png"
    }
}

fun interpretTemp(temp: Double): String {
    return when {
        temp < 10-> {
            "Cold"
        }
        temp > 15-> {
            "Hot"
        }
        else -> {
            "Normal"
        }
    }
}