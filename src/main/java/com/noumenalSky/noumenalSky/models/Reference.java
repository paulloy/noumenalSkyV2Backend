package com.noumenalSky.noumenalSky.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class Reference {

    private Long id;
    private String title;
    private String author;
    private String department;
    private String url;
    private Date publishedDate;

    public Reference() {}

    public Reference(String title,
                     String author,
                     String department,
                     String url,
                     Date publishedDate) {
        this.title = title;
        this.author = author;
        this.department = department;
        this.url = url;
        this.publishedDate = publishedDate;
    }
}
