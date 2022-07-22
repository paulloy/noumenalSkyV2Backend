package com.noumenalSky.noumenalSky.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "data_reference")
public class DataReference {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "author", nullable = false, length = 256)
    private String author;

    @Column(name = "title", nullable = false, length = 512)
    private String title;

    @Column(name = "address", length = 512)
    private String address;

    @JsonBackReference
    @OneToMany(
            fetch = FetchType.EAGER,
            mappedBy = "dataReference"
    )
    private List<Property> properties;
}
