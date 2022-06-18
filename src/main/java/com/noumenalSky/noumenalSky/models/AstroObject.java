package com.noumenalSky.noumenalSky.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "astroObject")
public class AstroObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "objectType", nullable = false, length = 20)
    private String objectType;
    @Column(name = "name", nullable = false, length = 20)
    private String name;
    @Column(name = "description", nullable = false, length = 280)
    private String description;
    @Column(name = "nameOrigin", nullable = true, length = 280)
    private String nameOrigin;
    @Column(name = "rotationalPeriod", nullable = true)
    private List<Measurement> rotationalPeriod;
    @Column(name = "orbitalPeriod", nullable = true)
    private List<Measurement> orbitalPeriod;
    @Column(name = "meanDistance", nullable = true)
    private List<Measurement> meanDistance;
    @Column(name = "minDistance", nullable = true)
    private List<Measurement> minDistance;
    @Column(name = "maxDistance", nullable = true)
    private List<Measurement> maxDistance;
    @Column(name = "eccentricity", nullable = true)
    private List<Measurement> eccentricity;
    @Column(name = "axialTilt", nullable = true)
    private List<Measurement> axialTilt;
    @Column(name = "numberOfMoons", nullable = true, length = 2)
    private Long numberOfMoons;
    @Column(name = "mass", nullable = true)
    private List<Measurement> mass;
    @Column(name = "diameter", nullable = true)
    private List<Measurement> diameter;
    @Column(name = "density", nullable = true)
    private List<Measurement> density;
    @Column(name = "gravitationalForce", nullable = true)
    private List<Measurement> gravitationalForce;
    @Column(name = "hasRingSystem", nullable = true)
    private Boolean hasRingSystem;
    @Column(name = "bondAlbedo", nullable = true)
    private List<Measurement> bondAlbeldo;

    public class Measurement {
        private String measurement;
        private String unit;
    }

    public AstroObject() {}

    public AstroObject(String objectType,
                       String name,
                       String description,
                       String nameOrigin,
                       List<Measurement> rotationalPeriod,
                       List<Measurement> orbitalPeriod,
                       List<Measurement> meanDistance,
                       List<Measurement> minDistance,
                       List<Measurement> maxDistance,
                       List<Measurement> eccentricity,
                       List<Measurement> axialTilt,
                       Long numberOfMoons,
                       List<Measurement> mass,
                       List<Measurement> diameter,
                       List<Measurement> density,
                       List<Measurement> gravitationalForce,
                       Boolean hasRingSystem,
                       List<Measurement> bondAlbeldo) {
        this.objectType = objectType;
        this.name = name;
        this.description = description;
        this.nameOrigin = nameOrigin;
        this.rotationalPeriod = rotationalPeriod;
        this.orbitalPeriod = orbitalPeriod;
        this.meanDistance = meanDistance;
        this.minDistance = minDistance;
        this.maxDistance = maxDistance;
        this.eccentricity = eccentricity;
        this.axialTilt = axialTilt;
        this.numberOfMoons = numberOfMoons;
        this.mass = mass;
        this.diameter = diameter;
        this.density = density;
        this.gravitationalForce = gravitationalForce;
        this.hasRingSystem = hasRingSystem;
        this.bondAlbeldo = bondAlbeldo;
    }
}
