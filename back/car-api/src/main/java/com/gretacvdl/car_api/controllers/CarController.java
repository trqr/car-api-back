package com.gretacvdl.car_api.controllers;

import com.gretacvdl.car_api.dtos.RequestAddCarDTO;
import com.gretacvdl.car_api.models.Car;
import com.gretacvdl.car_api.services.CarService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/car")
public class CarController {

    @Autowired
    private CarService carService;

    @PostMapping("/add")
    public ResponseEntity<Car> addCar(@Valid @RequestBody RequestAddCarDTO request){
        return ResponseEntity.ok(carService.addCar(request));
    }
}
