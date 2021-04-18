package weather.controllers

import com.fasterxml.jackson.databind.ObjectMapper
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import weather.domain.Gps
import weather.services.GpsService
import javax.inject.Inject


@Controller
class GpsController(@Inject val gpsService: GpsService) {

    @Post(value = "/gps", produces = ["application/json"])
    fun insertAccount(@Body gps: Gps): HttpResponse<String> {
        println(gps)
        gpsService.insertGps(gps)

        return HttpResponse.ok("gps data collected")
    }

    companion object {
        private val mapper = ObjectMapper()
    }
}
