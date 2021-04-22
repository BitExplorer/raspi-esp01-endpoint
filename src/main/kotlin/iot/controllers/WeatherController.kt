package iot.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import iot.domain.Weather
import iot.services.WeatherService
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import javax.inject.Inject

@Controller
class WeatherController(@Inject val weatherService: WeatherService) {

    @Post(value = "/weather", produces = ["application/json"])
    fun insertWeather(@Body weather: Weather): HttpResponse<String> {
        weatherService.insertWeather(weather)
        logger.info(weather)
        return HttpResponse.ok("weather data inserted")
    }

    companion object {
        private val logger: Logger = LogManager.getLogger()
    }
}
