package com.noumenalSky.noumenalSky.models;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "astro_object")
public class AstroObject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "name", nullable = false, length = 12)
    private String name;

    @Column(name = "type", nullable = false, length = 30)
    private String type;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "astro_object_id")
    private List<Property> properties;


    public AstroObject(String name, String type, String imageAddress) {
        this.name = name;
        this.type = type;
    }
}
