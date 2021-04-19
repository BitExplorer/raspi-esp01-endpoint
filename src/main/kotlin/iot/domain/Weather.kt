package iot.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import javax.validation.constraints.Size
import javax.persistence.*

@Entity
@JsonIgnoreProperties(ignoreUnknown = true)
class Weather {
    @Id
    @JsonProperty
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @JsonProperty
    @field:Size(min = 3, max = 40)
    var location: String = "";

    @JsonProperty
    @field:Size(min = 3, max = 40)
    var timestamp: String = "";

    @JsonProperty
    @field:Size(min = 3, max = 40)
    var temperature: String = "";

    @JsonProperty
    @field:Size(min = 3, max = 40)
    var humidity: String = "";

    override fun toString(): String {
        return mapper.writeValueAsString(this)
    }

    companion object {
        @JsonIgnore
        private val mapper = ObjectMapper()
    }
}
