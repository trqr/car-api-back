package com.gretacvdl.car_api.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

public class RequestOwnerDTO {

    @NotNull(message = "Votre nom ne peut pas être null")
    @Min(value = 3, message = "Votre nom doit avoir au moins 3 caractères.")
    private String name;

    @NotNull(message = "Votre nom ne peut pas être null")
    @Email(message = "Le format doit être le format email")
    private String email;

    public RequestOwnerDTO(){}

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
