package weather.services

import weather.domain.Gps
import weather.repositories.GpsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class GpsService(@Inject val gpsRepository: GpsRepository) {
    open fun insertGps( gps: Gps): Boolean {
        gpsRepository.save(gps)
        return true
    }
}