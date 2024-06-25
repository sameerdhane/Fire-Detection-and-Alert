package com.example.firedetection.controller;

import com.example.firedetection.model.Alert;
import com.example.firedetection.model.Sensor;
import com.example.firedetection.service.AlertService;
import com.example.firedetection.service.SensorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FireDetectionController {

    @Autowired
    private SensorService sensorService;

    @Autowired
    private AlertService alertService;

    @GetMapping("/sensors")
    public List<Sensor> getAllSensors() {
        return sensorService.findAll();
    }

    @PostMapping("/alerts")
    public Alert createAlert(@RequestBody Alert alert) {
        return alertService.save(alert);
    }
}
