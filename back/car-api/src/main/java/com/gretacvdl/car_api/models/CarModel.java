package com.gretacvdl.car_api.models;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class CarModel {

    @Id
    private Long id;
    private double price;
    @ManyToOne
    @JoinColumn(name = "maker_id")
    private Maker maker;
    private String model;
    private LocalDate releaseDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Maker getMaker() {
        return maker;
    }

    public void setMaker(Maker maker) {
        this.maker = maker;
    }
}
