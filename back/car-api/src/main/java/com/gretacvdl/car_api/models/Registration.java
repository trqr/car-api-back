package com.gretacvdl.car_api.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Registration {

    @Id
    @GeneratedValue
    private Long id;
    private String plateNumber;
    private LocalDate expirationDate;
    @OneToOne
    private Car car;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
