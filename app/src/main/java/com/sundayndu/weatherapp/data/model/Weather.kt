package com.sundayndu.weatherapp.data.model

data class Weather(
    val id: Long,
    val main: String,
    val description: String,
    val icon: String
)

/*
Develop a native Android application that contains at least the following elements:
- A list screen, displays x days weather forecast for Berlin (every 3 hours)
- A detail screen, displays the maximum information for a specific hour chosen by the user in the list screen
- On the detail screen display “Hot” if temperature is greater than 15°C, “Cold” if temperature is below 10°C
Focus :
- Choice of architecture (MVVM, MVP, etc...)
- Unit Tests
- Justify any external dependencies that you might use
- Code quality and code conventions
Bonus :
- Searching different cities
- Remember search history
- Any additional feature/design that you can think of
Technical information
- Documentation : http://openweathermap.org/api http://openweathermap.org/weather-conditions
- Content url : http://api.openweathermap.org/data/2.5/forecast?q=berlin&units=metric&appid=428d70aa1268b4be33b6fd9d7f12bc2c
 */
