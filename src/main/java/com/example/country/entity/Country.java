package com.example.country.entity;

import lombok.Data;
import javax.persistence.*;

@Entity
@Table(name = "country", schema = "strana")
@Data
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "isocode")
    private String isocode;
}


