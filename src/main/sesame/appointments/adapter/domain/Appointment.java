
package appointments.adapter.domain;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "doctor",
    "durationInMinutes",
    "time",
    "service",
    "location",
    "id"
})
public class Appointment {

    @JsonProperty("doctor")
    private Doctor doctor;
    @JsonProperty("durationInMinutes")
    private Integer durationInMinutes;
    @JsonProperty("time")
    private String time;
    @JsonProperty("service")
    private Service service;
    @JsonProperty("location")
    private Location location;
    @JsonProperty("id")
    private String id;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("doctor")
    public Doctor getDoctor() {
        return doctor;
    }

    @JsonProperty("doctor")
    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    @JsonProperty("durationInMinutes")
    public Integer getDurationInMinutes() {
        return durationInMinutes;
    }

    @JsonProperty("durationInMinutes")
    public void setDurationInMinutes(Integer durationInMinutes) {
        this.durationInMinutes = durationInMinutes;
    }

    @JsonProperty("time")
    public String getTime() {
        return time;
    }

    @JsonProperty("time")
    public void setTime(String time) {
        this.time = time;
    }

    @JsonProperty("service")
    public Service getService() {
        return service;
    }

    @JsonProperty("service")
    public void setService(Service service) {
        this.service = service;
    }

    @JsonProperty("location")
    public Location getLocation() {
        return location;
    }

    @JsonProperty("location")
    public void setLocation(Location location) {
        this.location = location;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
