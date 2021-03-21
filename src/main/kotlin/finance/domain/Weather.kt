package finance.domain

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.databind.ObjectMapper
import org.hibernate.annotations.Proxy
import java.math.BigDecimal
import java.sql.Timestamp
import java.util.*
import javax.persistence.*
import javax.validation.constraints.Digits
import javax.validation.constraints.Min
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size

@JsonIgnoreProperties(ignoreUnknown = true)
class Weather {

    // @JsonProperty
    // @field:Min(value = 0L)
    // var accountId: Long = 0L;

    @JsonProperty
    @field:Size(min = 3, max = 40)
    var location: String = "";

    @JsonProperty
    @field:Size(min = 3, max = 40)
    var timestamp: String = "";

    @JsonProperty
    @field:Size(min = 3, max = 40)
    var temperature: String = "";
    // constructor() : this(
    //   0L, "", "", ""
    // )

    override fun toString(): String {
        //mapper.setTimeZone(TimeZone.getDefault())
        return mapper.writeValueAsString(this)
    }

    companion object {
        @JsonIgnore
        private val mapper = ObjectMapper()
    }
}
