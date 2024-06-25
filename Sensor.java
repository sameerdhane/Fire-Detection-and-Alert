package com.example.firedetection.model;

import javax.persistence.*;

@Entity
public class Sensor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String location;
    private String status;
    private String lastChecked;

    // Getters and setters
}
