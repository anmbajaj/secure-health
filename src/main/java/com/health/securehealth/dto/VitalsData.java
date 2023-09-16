package com.health.securehealth.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class VitalsData {
    @JsonProperty("heart_rate")
    private Integer heartRate;
    @JsonProperty("ecg")
    private Integer ecg;
    @JsonProperty("blood_oxygen")
    private Integer bloodOxygen;
    @JsonProperty("body_temperature")
    private Integer bodyTemperature;
    @JsonProperty("respiration_rate")
    private Integer respiratoryRate;
//    @JsonProperty("")
//    private Integer ;
//    @JsonProperty("")
//    private Integer temperature;
}
