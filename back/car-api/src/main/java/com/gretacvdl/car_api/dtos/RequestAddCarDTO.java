package com.gretacvdl.car_api.dtos;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public class RequestAddCarDTO {
    @NotNull
    private Long ownerId;
    @NotNull
    private Long carModelId;
    @NotNull
    private String plateNumber;
    @NotNull
    private LocalDate expirationDate;

    public RequestAddCarDTO(){}

    public Long getOwnerId() {
        return ownerId;
    }

    public Long getCarModelId() {
        return carModelId;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }
}
