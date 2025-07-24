package com.gretacvdl.car_api.services;

import com.gretacvdl.car_api.dtos.RequestAddCarDTO;
import com.gretacvdl.car_api.models.Car;
import com.gretacvdl.car_api.models.CarModel;
import com.gretacvdl.car_api.models.Owner;
import com.gretacvdl.car_api.models.Registration;
import com.gretacvdl.car_api.repositories.CarModelRepository;
import com.gretacvdl.car_api.repositories.CarRepository;
import com.gretacvdl.car_api.repositories.OwnerRepository;
import com.gretacvdl.car_api.repositories.RegistrationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    private CarModelRepository carModelRepository;
    @Autowired
    private OwnerRepository ownerRepository;
    @Autowired
    private CarRepository carRepository;
    @Autowired
    private RegistrationRepository registrationRepository;

    public Car addCar(RequestAddCarDTO request){
        CarModel model = carModelRepository.findById(request.getCarModelId())
                .orElseThrow(() -> new IllegalArgumentException("Il n'y a pas de model pour cet ID."));

        Owner owner = ownerRepository.findById(request.getOwnerId())
                .orElseThrow(() -> new IllegalArgumentException("Il n'y a pas de propriétaire pour cet ID."));

        Registration registration = new Registration(request.getPlateNumber(), request.getExpirationDate());

        Car createdCar = new Car(model, registration, owner);
        registration.setCar(createdCar);
        owner.addCar(createdCar);
        return carRepository.save(createdCar);
    }
}
