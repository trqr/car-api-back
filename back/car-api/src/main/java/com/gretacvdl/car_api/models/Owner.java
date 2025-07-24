package com.gretacvdl.car_api.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Owner {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    @OneToMany(mappedBy = "owner", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Car> ownedCars = new ArrayList<>();


    public Owner(){}

    public Owner(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Car> getOwnedCars() {
        return ownedCars;
    }

    public void setOwnedCars(List<Car> ownedCars) {
        this.ownedCars = ownedCars;
    }

    public void addCar(Car car) {
        car.setOwner(this);
        ownedCars.add(car);
    }
}
