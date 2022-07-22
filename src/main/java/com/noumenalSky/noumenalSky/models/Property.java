package com.noumenalSky.noumenalSky.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "astro_object_property")
public class Property {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 12)
    private String name;

    @Column(name = "type", nullable = false, length = 30)
    private String type;

    @Column(name = "value", nullable = false, length = 5)
    private double value;

    @Column(name = "magnitude")
    private byte magnitude;

    @Column(name = "unit", length = 12)
    private String unit;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.EAGER)
    private AstroObject astroObject;

    @ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private DataReference dataReference;
}
