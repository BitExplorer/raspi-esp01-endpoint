package weather.repositories


import weather.domain.Gps
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository

@Repository
interface GpsRepository : JpaRepository<Gps, Long> {
}