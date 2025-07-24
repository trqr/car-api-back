package com.gretacvdl.car_api.controllers;

import com.gretacvdl.car_api.models.CarModel;
import com.gretacvdl.car_api.services.CarModelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/carmodels")
public class CarModelController {

    @Autowired
    private CarModelService carModelService;

    @GetMapping("/all")
    public ResponseEntity<List<CarModel>> getAllCars(){
        return ResponseEntity.ok(carModelService.getAllCars());
    }

    @GetMapping("/{makerId}")
    public ResponseEntity<List<CarModel>> getMakerCars(@PathVariable Long makerId){
        return ResponseEntity.ok(carModelService.getMakerCars(makerId));
    }
}
