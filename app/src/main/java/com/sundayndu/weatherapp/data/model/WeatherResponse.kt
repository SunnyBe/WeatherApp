package com.sundayndu.weatherapp.data.model

data class WeatherResponse(
    val cod: String,
    val message: Long,
    val cnt: Long,
    val list: List<WeatherListItem>,
    val city: City
)

/*
{
  "cod": "200",
  "message": 0,
  "cnt": 40,
  "list": [
    {
      "dt": 1639666800,
      "main": {
        "temp": 8.58,
        "feels_like": 6.18,
        "temp_min": 6.95,
        "temp_max": 8.58,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1028,
        "humidity": 86,
        "temp_kf": 1.63
      },
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 58
      },
      "wind": {
        "speed": 4.16,
        "deg": 282,
        "gust": 9.84
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-16 15:00:00"
    },
    {
      "dt": 1639677600,
      "main": {
        "temp": 6.84,
        "feels_like": 4.3,
        "temp_min": 5.56,
        "temp_max": 6.84,
        "pressure": 1031,
        "sea_level": 1031,
        "grnd_level": 1030,
        "humidity": 91,
        "temp_kf": 1.28
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03n"
        }
      ],
      "clouds": {
        "all": 33
      },
      "wind": {
        "speed": 3.67,
        "deg": 287,
        "gust": 10.61
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-16 18:00:00"
    },
    {
      "dt": 1639688400,
      "main": {
        "temp": 4.96,
        "feels_like": 1.7,
        "temp_min": 4.96,
        "temp_max": 4.96,
        "pressure": 1035,
        "sea_level": 1035,
        "grnd_level": 1030,
        "humidity": 88,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 2
      },
      "wind": {
        "speed": 4.2,
        "deg": 290,
        "gust": 12.14
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-16 21:00:00"
    },
    {
      "dt": 1639699200,
      "main": {
        "temp": 4.28,
        "feels_like": 0.93,
        "temp_min": 4.28,
        "temp_max": 4.28,
        "pressure": 1035,
        "sea_level": 1035,
        "grnd_level": 1030,
        "humidity": 87,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 3
      },
      "wind": {
        "speed": 4.07,
        "deg": 292,
        "gust": 11.93
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-17 00:00:00"
    },
    {
      "dt": 1639710000,
      "main": {
        "temp": 3.96,
        "feels_like": 0.4,
        "temp_min": 3.96,
        "temp_max": 3.96,
        "pressure": 1035,
        "sea_level": 1035,
        "grnd_level": 1030,
        "humidity": 85,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 2
      },
      "wind": {
        "speed": 4.32,
        "deg": 301,
        "gust": 12.56
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-17 03:00:00"
    },
    {
      "dt": 1639720800,
      "main": {
        "temp": 3.33,
        "feels_like": 0.19,
        "temp_min": 3.33,
        "temp_max": 3.33,
        "pressure": 1035,
        "sea_level": 1035,
        "grnd_level": 1030,
        "humidity": 89,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 21
      },
      "wind": {
        "speed": 3.42,
        "deg": 302,
        "gust": 10.77
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-17 06:00:00"
    },
    {
      "dt": 1639731600,
      "main": {
        "temp": 3.85,
        "feels_like": 0.91,
        "temp_min": 3.85,
        "temp_max": 3.85,
        "pressure": 1035,
        "sea_level": 1035,
        "grnd_level": 1030,
        "humidity": 86,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 60
      },
      "wind": {
        "speed": 3.29,
        "deg": 296,
        "gust": 9.22
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-17 09:00:00"
    },
    {
      "dt": 1639742400,
      "main": {
        "temp": 6.11,
        "feels_like": 4.2,
        "temp_min": 6.11,
        "temp_max": 6.11,
        "pressure": 1036,
        "sea_level": 1036,
        "grnd_level": 1030,
        "humidity": 81,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 49
      },
      "wind": {
        "speed": 2.52,
        "deg": 308,
        "gust": 6.75
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-17 12:00:00"
    },
    {
      "dt": 1639753200,
      "main": {
        "temp": 4.68,
        "feels_like": 2.76,
        "temp_min": 4.68,
        "temp_max": 4.68,
        "pressure": 1036,
        "sea_level": 1036,
        "grnd_level": 1030,
        "humidity": 94,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03n"
        }
      ],
      "clouds": {
        "all": 39
      },
      "wind": {
        "speed": 2.24,
        "deg": 293,
        "gust": 4.43
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-17 15:00:00"
    },
    {
      "dt": 1639764000,
      "main": {
        "temp": 3.75,
        "feels_like": 1.52,
        "temp_min": 3.75,
        "temp_max": 3.75,
        "pressure": 1037,
        "sea_level": 1037,
        "grnd_level": 1031,
        "humidity": 96,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 21
      },
      "wind": {
        "speed": 2.39,
        "deg": 316,
        "gust": 4.96
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-17 18:00:00"
    },
    {
      "dt": 1639774800,
      "main": {
        "temp": 3.13,
        "feels_like": 1.34,
        "temp_min": 3.13,
        "temp_max": 3.13,
        "pressure": 1037,
        "sea_level": 1037,
        "grnd_level": 1031,
        "humidity": 95,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 5
      },
      "wind": {
        "speed": 1.87,
        "deg": 322,
        "gust": 2.2
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-17 21:00:00"
    },
    {
      "dt": 1639785600,
      "main": {
        "temp": 2.84,
        "feels_like": 1.24,
        "temp_min": 2.84,
        "temp_max": 2.84,
        "pressure": 1037,
        "sea_level": 1037,
        "grnd_level": 1032,
        "humidity": 94,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 14
      },
      "wind": {
        "speed": 1.68,
        "deg": 270,
        "gust": 1.64
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-18 00:00:00"
    },
    {
      "dt": 1639796400,
      "main": {
        "temp": 3.04,
        "feels_like": 0.85,
        "temp_min": 3.04,
        "temp_max": 3.04,
        "pressure": 1036,
        "sea_level": 1036,
        "grnd_level": 1031,
        "humidity": 98,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 18
      },
      "wind": {
        "speed": 2.22,
        "deg": 266,
        "gust": 3.94
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-18 03:00:00"
    },
    {
      "dt": 1639807200,
      "main": {
        "temp": 5.3,
        "feels_like": 4,
        "temp_min": 5.3,
        "temp_max": 5.3,
        "pressure": 1035,
        "sea_level": 1035,
        "grnd_level": 1030,
        "humidity": 92,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 54
      },
      "wind": {
        "speed": 1.74,
        "deg": 233,
        "gust": 1.74
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-18 06:00:00"
    },
    {
      "dt": 1639818000,
      "main": {
        "temp": 6.03,
        "feels_like": 3.84,
        "temp_min": 6.03,
        "temp_max": 6.03,
        "pressure": 1035,
        "sea_level": 1035,
        "grnd_level": 1030,
        "humidity": 92,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 2.86,
        "deg": 272,
        "gust": 6.79
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-18 09:00:00"
    },
    {
      "dt": 1639828800,
      "main": {
        "temp": 6.09,
        "feels_like": 4.35,
        "temp_min": 6.09,
        "temp_max": 6.09,
        "pressure": 1034,
        "sea_level": 1034,
        "grnd_level": 1028,
        "humidity": 91,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 98
      },
      "wind": {
        "speed": 2.31,
        "deg": 262,
        "gust": 6.45
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-18 12:00:00"
    },
    {
      "dt": 1639839600,
      "main": {
        "temp": 6,
        "feels_like": 3.76,
        "temp_min": 6,
        "temp_max": 6,
        "pressure": 1031,
        "sea_level": 1031,
        "grnd_level": 1026,
        "humidity": 94,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 2.93,
        "deg": 243,
        "gust": 7.41
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-18 15:00:00"
    },
    {
      "dt": 1639850400,
      "main": {
        "temp": 6.43,
        "feels_like": 3.32,
        "temp_min": 6.43,
        "temp_max": 6.43,
        "pressure": 1030,
        "sea_level": 1030,
        "grnd_level": 1024,
        "humidity": 88,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 99
      },
      "wind": {
        "speed": 4.57,
        "deg": 267,
        "gust": 8.66
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-18 18:00:00"
    },
    {
      "dt": 1639861200,
      "main": {
        "temp": 6.59,
        "feels_like": 4.03,
        "temp_min": 6.59,
        "temp_max": 6.59,
        "pressure": 1028,
        "sea_level": 1028,
        "grnd_level": 1022,
        "humidity": 93,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 100
      },
      "wind": {
        "speed": 3.61,
        "deg": 261,
        "gust": 8.96
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-18 21:00:00"
    },
    {
      "dt": 1639872000,
      "main": {
        "temp": 5.78,
        "feels_like": 2.23,
        "temp_min": 5.78,
        "temp_max": 5.78,
        "pressure": 1025,
        "sea_level": 1025,
        "grnd_level": 1020,
        "humidity": 92,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 93
      },
      "wind": {
        "speed": 5.19,
        "deg": 269,
        "gust": 11.46
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-19 00:00:00"
    },
    {
      "dt": 1639882800,
      "main": {
        "temp": 5.89,
        "feels_like": 2,
        "temp_min": 5.89,
        "temp_max": 5.89,
        "pressure": 1022,
        "sea_level": 1022,
        "grnd_level": 1017,
        "humidity": 89,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 804,
          "main": "Clouds",
          "description": "overcast clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 87
      },
      "wind": {
        "speed": 6.06,
        "deg": 278,
        "gust": 13.77
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-19 03:00:00"
    },
    {
      "dt": 1639893600,
      "main": {
        "temp": 6.19,
        "feels_like": 2.05,
        "temp_min": 6.19,
        "temp_max": 6.19,
        "pressure": 1019,
        "sea_level": 1019,
        "grnd_level": 1014,
        "humidity": 85,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04n"
        }
      ],
      "clouds": {
        "all": 51
      },
      "wind": {
        "speed": 6.99,
        "deg": 289,
        "gust": 16.22
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-19 06:00:00"
    },
    {
      "dt": 1639904400,
      "main": {
        "temp": 6.45,
        "feels_like": 2.62,
        "temp_min": 6.45,
        "temp_max": 6.45,
        "pressure": 1019,
        "sea_level": 1019,
        "grnd_level": 1013,
        "humidity": 83,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 500,
          "main": "Rain",
          "description": "light rain",
          "icon": "10d"
        }
      ],
      "clouds": {
        "all": 64
      },
      "wind": {
        "speed": 6.31,
        "deg": 308,
        "gust": 12.33
      },
      "visibility": 10000,
      "pop": 0.21,
      "rain": {
        "3h": 0.13
      },
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-19 09:00:00"
    },
    {
      "dt": 1639915200,
      "main": {
        "temp": 7,
        "feels_like": 3.76,
        "temp_min": 7,
        "temp_max": 7,
        "pressure": 1019,
        "sea_level": 1019,
        "grnd_level": 1014,
        "humidity": 80,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 500,
          "main": "Rain",
          "description": "light rain",
          "icon": "10d"
        }
      ],
      "clouds": {
        "all": 75
      },
      "wind": {
        "speed": 5.18,
        "deg": 313,
        "gust": 9.4
      },
      "visibility": 10000,
      "pop": 0.2,
      "rain": {
        "3h": 0.14
      },
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-19 12:00:00"
    },
    {
      "dt": 1639926000,
      "main": {
        "temp": 5.69,
        "feels_like": 2.39,
        "temp_min": 5.69,
        "temp_max": 5.69,
        "pressure": 1019,
        "sea_level": 1019,
        "grnd_level": 1014,
        "humidity": 80,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 19
      },
      "wind": {
        "speed": 4.6,
        "deg": 313,
        "gust": 10.11
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-19 15:00:00"
    },
    {
      "dt": 1639936800,
      "main": {
        "temp": 3.46,
        "feels_like": -0.3,
        "temp_min": 3.46,
        "temp_max": 3.46,
        "pressure": 1021,
        "sea_level": 1021,
        "grnd_level": 1015,
        "humidity": 68,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 10
      },
      "wind": {
        "speed": 4.45,
        "deg": 331,
        "gust": 11.12
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-19 18:00:00"
    },
    {
      "dt": 1639947600,
      "main": {
        "temp": 2.17,
        "feels_like": -2.08,
        "temp_min": 2.17,
        "temp_max": 2.17,
        "pressure": 1022,
        "sea_level": 1022,
        "grnd_level": 1016,
        "humidity": 72,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 1
      },
      "wind": {
        "speed": 4.77,
        "deg": 322,
        "gust": 12.33
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-19 21:00:00"
    },
    {
      "dt": 1639958400,
      "main": {
        "temp": 1.6,
        "feels_like": -2.69,
        "temp_min": 1.6,
        "temp_max": 1.6,
        "pressure": 1022,
        "sea_level": 1022,
        "grnd_level": 1017,
        "humidity": 72,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 3
      },
      "wind": {
        "speed": 4.6,
        "deg": 313,
        "gust": 11.57
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-20 00:00:00"
    },
    {
      "dt": 1639969200,
      "main": {
        "temp": 0.97,
        "feels_like": -3.08,
        "temp_min": 0.97,
        "temp_max": 0.97,
        "pressure": 1023,
        "sea_level": 1023,
        "grnd_level": 1018,
        "humidity": 77,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 9
      },
      "wind": {
        "speed": 3.98,
        "deg": 310,
        "gust": 10.17
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-20 03:00:00"
    },
    {
      "dt": 1639980000,
      "main": {
        "temp": 0.19,
        "feels_like": -3.81,
        "temp_min": 0.19,
        "temp_max": 0.19,
        "pressure": 1025,
        "sea_level": 1025,
        "grnd_level": 1019,
        "humidity": 83,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 8
      },
      "wind": {
        "speed": 3.67,
        "deg": 311,
        "gust": 9.48
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-20 06:00:00"
    },
    {
      "dt": 1639990800,
      "main": {
        "temp": 0.92,
        "feels_like": -2.69,
        "temp_min": 0.92,
        "temp_max": 0.92,
        "pressure": 1026,
        "sea_level": 1026,
        "grnd_level": 1021,
        "humidity": 81,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 8
      },
      "wind": {
        "speed": 3.36,
        "deg": 317,
        "gust": 8.75
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-20 09:00:00"
    },
    {
      "dt": 1640001600,
      "main": {
        "temp": 3.09,
        "feels_like": -0.29,
        "temp_min": 3.09,
        "temp_max": 3.09,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1021,
        "humidity": 72,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01d"
        }
      ],
      "clouds": {
        "all": 8
      },
      "wind": {
        "speed": 3.69,
        "deg": 323,
        "gust": 7.82
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-20 12:00:00"
    },
    {
      "dt": 1640012400,
      "main": {
        "temp": 1.68,
        "feels_like": -1.35,
        "temp_min": 1.68,
        "temp_max": 1.68,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1022,
        "humidity": 83,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 800,
          "main": "Clear",
          "description": "clear sky",
          "icon": "01n"
        }
      ],
      "clouds": {
        "all": 9
      },
      "wind": {
        "speed": 2.85,
        "deg": 310,
        "gust": 6.63
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-20 15:00:00"
    },
    {
      "dt": 1640023200,
      "main": {
        "temp": 0.39,
        "feels_like": -2.42,
        "temp_min": 0.39,
        "temp_max": 0.39,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1022,
        "humidity": 89,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 17
      },
      "wind": {
        "speed": 2.37,
        "deg": 312,
        "gust": 5.63
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-20 18:00:00"
    },
    {
      "dt": 1640034000,
      "main": {
        "temp": -0.31,
        "feels_like": -2.93,
        "temp_min": -0.31,
        "temp_max": -0.31,
        "pressure": 1027,
        "sea_level": 1027,
        "grnd_level": 1022,
        "humidity": 91,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 15
      },
      "wind": {
        "speed": 2.09,
        "deg": 297,
        "gust": 3.95
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-20 21:00:00"
    },
    {
      "dt": 1640044800,
      "main": {
        "temp": -0.67,
        "feels_like": -3.64,
        "temp_min": -0.67,
        "temp_max": -0.67,
        "pressure": 1026,
        "sea_level": 1026,
        "grnd_level": 1020,
        "humidity": 92,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03n"
        }
      ],
      "clouds": {
        "all": 41
      },
      "wind": {
        "speed": 2.34,
        "deg": 280,
        "gust": 5.59
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-21 00:00:00"
    },
    {
      "dt": 1640055600,
      "main": {
        "temp": -0.87,
        "feels_like": -4.08,
        "temp_min": -0.87,
        "temp_max": -0.87,
        "pressure": 1025,
        "sea_level": 1025,
        "grnd_level": 1019,
        "humidity": 95,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 16
      },
      "wind": {
        "speed": 2.53,
        "deg": 267,
        "gust": 6.76
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-21 03:00:00"
    },
    {
      "dt": 1640066400,
      "main": {
        "temp": -1.09,
        "feels_like": -4.72,
        "temp_min": -1.09,
        "temp_max": -1.09,
        "pressure": 1023,
        "sea_level": 1023,
        "grnd_level": 1017,
        "humidity": 89,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 801,
          "main": "Clouds",
          "description": "few clouds",
          "icon": "02n"
        }
      ],
      "clouds": {
        "all": 21
      },
      "wind": {
        "speed": 2.9,
        "deg": 250,
        "gust": 7.79
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "n"
      },
      "dt_txt": "2021-12-21 06:00:00"
    },
    {
      "dt": 1640077200,
      "main": {
        "temp": -0.08,
        "feels_like": -4.41,
        "temp_min": -0.08,
        "temp_max": -0.08,
        "pressure": 1021,
        "sea_level": 1021,
        "grnd_level": 1016,
        "humidity": 80,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 802,
          "main": "Clouds",
          "description": "scattered clouds",
          "icon": "03d"
        }
      ],
      "clouds": {
        "all": 44
      },
      "wind": {
        "speed": 4.04,
        "deg": 239,
        "gust": 10.25
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-21 09:00:00"
    },
    {
      "dt": 1640088000,
      "main": {
        "temp": 1.45,
        "feels_like": -3.07,
        "temp_min": 1.45,
        "temp_max": 1.45,
        "pressure": 1018,
        "sea_level": 1018,
        "grnd_level": 1013,
        "humidity": 75,
        "temp_kf": 0
      },
      "weather": [
        {
          "id": 803,
          "main": "Clouds",
          "description": "broken clouds",
          "icon": "04d"
        }
      ],
      "clouds": {
        "all": 66
      },
      "wind": {
        "speed": 4.94,
        "deg": 251,
        "gust": 11.69
      },
      "visibility": 10000,
      "pop": 0,
      "sys": {
        "pod": "d"
      },
      "dt_txt": "2021-12-21 12:00:00"
    }
  ],
  "city": {
    "id": 2950159,
    "name": "Berlin",
    "coord": {
      "lat": 52.5244,
      "lon": 13.4105
    },
    "country": "DE",
    "population": 1000000,
    "timezone": 3600,
    "sunrise": 1639638709,
    "sunset": 1639666338
  }
}
 */