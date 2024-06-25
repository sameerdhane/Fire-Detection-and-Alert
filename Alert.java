package com.example.firedetection.model;

import javax.persistence.*;

@Entity
public class Alert {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "sensor_id")
    private Sensor sensor;

    private String timestamp;
    private String status;
    private String description;

    // Getters and setters
}
