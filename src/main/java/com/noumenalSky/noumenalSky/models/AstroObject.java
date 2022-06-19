package com.noumenalSky.noumenalSky.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Map;

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

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Characteristic> characteristics;

    public AstroObject() {}

    public AstroObject(String objectType,
                       String name,
                       String description,
                       String nameOrigin,
                       List<Characteristic> characteristics) {
        this.objectType = objectType;
        this.name = name;
        this.description = description;
        this.nameOrigin = nameOrigin;
        this.characteristics = characteristics;
    }
}
