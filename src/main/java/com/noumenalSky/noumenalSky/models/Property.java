package com.noumenalSky.noumenalSky.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "astro_object_property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 12)
    private String name;

    @Column(name = "value", nullable = false, length = 6)
    private String value;

    @Column(name = "magnitude")
    private byte magnitude;

    @Column(name = "unit", length = 12)
    private String unit;

    public Property(String name, String value, byte magnitude, String unit) {
        this.name = name;
        this.value = value;
        this.magnitude = magnitude;
        this.unit = unit;
    }
}
