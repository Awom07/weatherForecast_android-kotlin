package com.example.weatherapp.adapters

data class WeatherModel(
    val city: String,
    val time: String,
    val condition: String,
    val currentTemp: String,
    val maxTemp: String,
    val minTemp: String,
    val imageUrl: String,
    val hours: String,
    val wind_kph: String,
    val pressure: String,
    val humidity: String,
    val feelslike_c: String
)
