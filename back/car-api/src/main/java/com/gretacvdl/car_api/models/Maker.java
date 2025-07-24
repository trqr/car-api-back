package com.gretacvdl.car_api.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Maker {
    @Id
    private Long id;
    private String name;
    private String country;
    private String logoPath;
    private String countryFlagPath;
    @OneToMany
    private List<CarModel> makerCarModels;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLogoPath() {
        return logoPath;
    }

    public void setLogoPath(String logoPath) {
        this.logoPath = logoPath;
    }

    public String getCountryFlagPath() {
        return countryFlagPath;
    }

    public void setCountryFlagPath(String countryFlagPath) {
        this.countryFlagPath = countryFlagPath;
    }


    public List<CarModel> getMakerCars() {
        return makerCarModels;
    }

    public void setMakerCars(List<CarModel> makerCarModels) {
        this.makerCarModels = makerCarModels;
    }
}
