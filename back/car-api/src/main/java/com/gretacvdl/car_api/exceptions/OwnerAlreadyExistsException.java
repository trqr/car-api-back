package com.gretacvdl.car_api.exceptions;

public class OwnerAlreadyExistsException extends RuntimeException {
    public OwnerAlreadyExistsException(String message) {
        super(message);
    }
}
