package com.gretacvdl.car_api.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Car {
    @Id
    @GeneratedValue
    private Long id;
    @OneToOne
    private CarModel model;
    @OneToOne(cascade = CascadeType.ALL)
    @JsonIgnore
    private Registration registration;
    @ManyToOne
    @JsonIgnore
    private Owner owner;
    @ManyToMany
    private List<Feature> featureList;

    public Car(){
    }

    public Car(CarModel model, Registration registration,Owner owner){
        this.model = model;
        this.registration = registration;
        this.owner = owner;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarModel getModel() {
        return model;
    }

    public void setModel(CarModel model) {
        this.model = model;
    }

    public Registration getRegistration() {
        return registration;
    }

    public void setRegistration(Registration registration) {
        this.registration = registration;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public List<Feature> getFeatureList() {
        return featureList;
    }

    public void setFeatureList(List<Feature> featureList) {
        this.featureList = featureList;
    }
}
