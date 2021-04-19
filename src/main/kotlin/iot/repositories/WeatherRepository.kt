package iot.repositories

import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import iot.domain.Weather

@Repository
interface WeatherRepository : JpaRepository<Weather, Long> {
}