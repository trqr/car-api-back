package com.gretacvdl.car_api.controllers;

import com.gretacvdl.car_api.models.Maker;
import com.gretacvdl.car_api.services.MakerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/makers")
public class MakerController {

    @Autowired
    private MakerService makerService;

    @GetMapping("")
    public ResponseEntity<List<Maker>> getMakers(){
        return ResponseEntity.ok(makerService.getMakers());
    }
}
