package com.emse.SmartPlant.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "SP_PLANT")
public class PlantEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 255)
    private String name; // Name of the plant


    private String plantType; // Type of plant (e.g., succulent, fern)


    private Double min_humidity; // Humidity requirement (in %)


    private Double max_humidity; // Humidity requirement (in %)

    @ManyToMany
    private List<SensorEntity> sensors; // List of sensors related to the plant (e.g., temperature, humidity)


    public PlantEntity(Long id,String name, String plantType, Double min_humidity, Double max_humidity) {
        this.id = id;
        this.name = name;
        this.plantType = plantType;
        this.min_humidity = min_humidity;
        this.max_humidity = max_humidity;
    }

    public PlantEntity() {

    }


    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public Double getMinHumidity() {
        return min_humidity;
    }


    public List<SensorEntity> getSensors() {
        return sensors;
    }

    public void setSensors(List<SensorEntity> sensors) {
        this.sensors = sensors;
    }
}