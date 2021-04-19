package iot.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import io.micronaut.context.annotation.Parameter
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import io.micronaut.http.annotation.*
import io.micronaut.http.server.exceptions.ExceptionHandler
import org.slf4j.LoggerFactory
import iot.domain.Gps
import iot.domain.Weather
import java.util.*
import javax.inject.Inject

@Controller
class WeatherController {

    @Post(value = "/weather", produces = ["application/json"])
    fun insertAccount(@Body weather: Weather): HttpResponse<String> {
        println(weather)
        return HttpResponse.ok("weather data collected")
    }

    companion object {
        private val mapper = ObjectMapper()
    }
}
