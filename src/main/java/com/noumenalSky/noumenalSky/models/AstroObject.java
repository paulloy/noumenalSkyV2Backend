package com.noumenalSky.noumenalSky.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
@Table(name = "astrophysics_objects")
public class AstroObject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", nullable = false, length = 12)
    private String name;

    @Column(name = "type", nullable = false, length = 30)
    private String type;

    @Column(name = "image_address", length = 256)
    private String imageAddress;

    public AstroObject() {
    }

    public AstroObject(String name, String type, String imageAddress) {
        this.name = name;
        this.type = type;
        this.imageAddress = imageAddress;
    }
}
