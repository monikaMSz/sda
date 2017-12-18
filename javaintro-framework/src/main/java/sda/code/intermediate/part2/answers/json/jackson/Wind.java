package sda.code.intermediate.part2.answers.json.jackson;

import com.fasterxml.jackson.annotation.*;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.HashMap;
import java.util.Map;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "speed",
        "deg"
})
public class Wind {

    @JsonProperty("speed")
    private Double speed;
    @JsonProperty("deg")
    private Double deg;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * @return The speed
     */
    @JsonProperty("speed")
    public Double getSpeed() {
        return speed;
    }

    /**
     * @param speed The speed
     */
    @JsonProperty("speed")
    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    /**
     * @return The deg
     */
    @JsonProperty("deg")
    public Double getDeg() {
        return deg;
    }

    /**
     * @param deg The deg
     */
    @JsonProperty("deg")
    public void setDeg(Double deg) {
        this.deg = deg;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(speed).append(deg).append(additionalProperties).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Wind) == false) {
            return false;
        }
        Wind rhs = ((Wind) other);
        return new EqualsBuilder().append(speed, rhs.speed).append(deg, rhs.deg).append(additionalProperties, rhs.additionalProperties).isEquals();
    }

}
