package com.health.securehealth.controller;

import com.health.securehealth.dto.HealthDataResponse;
import com.health.securehealth.dto.VitalsData;
import com.health.securehealth.service.HealthDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/data")
public class HealthDataController {

    @Autowired
    HealthDataService healthDataService;

    @PostMapping("/addData")
    public HealthDataResponse addData(@RequestBody VitalsData vitalsData){
        return healthDataService.checkHealth(vitalsData);
    }
}
