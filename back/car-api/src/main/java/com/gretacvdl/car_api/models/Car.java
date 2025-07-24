package com.gretacvdl.car_api.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private CarModel model;
    @OneToOne
    private Registration registration;
    @OneToOne
    private Owner owner;
    @ManyToMany
    private List<Feature> featureList;
}
