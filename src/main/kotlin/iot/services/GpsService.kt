package iot.services

import iot.domain.Gps
import iot.repositories.GpsRepository
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
open class GpsService(@Inject val gpsRepository: GpsRepository) {
    open fun insertGps( gps: Gps): Boolean {
        gpsRepository.save(gps)
        return true
    }
}