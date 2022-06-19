package com.noumenalSky.noumenalSky.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "characteristics")
public class Characteristic {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false, length = 20)
    private String name;

    @Column(name = "type", nullable = false, length = 20)
    private String type;

    @Column(name = "measurement", nullable = false, length = 8)
    private String measurement;

    @Column(name = "magnitude", nullable = true, length = 2)
    private byte magnitude;

    @Column(name = "unit", nullable = true, length = 8)
    private String unit;

    public Characteristic() {}

    public Characteristic(String name,
                          String type,
                          String measurement,
                          byte magnitude,
                          String unit) {
        this.name = name;
        this.type = type;
        this.measurement = measurement;
        this.magnitude = magnitude;
        this.unit = unit;
    }
}
