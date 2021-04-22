package iot.controllers

import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.*
import iot.domain.Gps
import iot.services.GpsService
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger
import javax.inject.Inject

@Controller
class GpsController(@Inject val gpsService: GpsService) {

    @Post(value = "/gps", produces = ["application/json"])
    fun insertGps(@Body gps: Gps): HttpResponse<String> {
        logger.info(gps)
        gpsService.insertGps(gps)

        return HttpResponse.ok("gps data inserted")
    }

    companion object {
        private val logger: Logger = LogManager.getLogger()
    }
}
