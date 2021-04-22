package iot.services

import iot.domain.Weather
import iot.repositories.WeatherRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class WeatherService(@Inject val weatherRepository: WeatherRepository) {
    open fun insertWeather( weather: Weather ): Boolean {
        weatherRepository.save(weather)
        return true
    }
}