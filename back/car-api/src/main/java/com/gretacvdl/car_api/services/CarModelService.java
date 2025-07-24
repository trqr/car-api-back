package com.gretacvdl.car_api.services;

import com.gretacvdl.car_api.models.CarModel;
import com.gretacvdl.car_api.repositories.CarModelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarModelService {

    @Autowired
    private CarModelRepository carModelRepository;

    public List<CarModel> getMakerCars(Long makerId){
        return carModelRepository.findAllByMakerId(makerId);
    }

    public List<CarModel> getAllCars() {
        return carModelRepository.findAll();
    }
}
