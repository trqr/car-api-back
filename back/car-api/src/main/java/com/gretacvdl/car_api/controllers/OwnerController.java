package com.gretacvdl.car_api.controllers;

import com.gretacvdl.car_api.dtos.RequestOwnerDTO;
import com.gretacvdl.car_api.models.Owner;
import com.gretacvdl.car_api.services.OwnerService;
import jakarta.validation.Valid;
import jdk.jshell.Snippet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/owners")
public class OwnerController {

    @Autowired
    private OwnerService ownerService;

    @GetMapping("/all")
    public ResponseEntity<List<Owner>> getOwner(){
        return ResponseEntity.ok(ownerService.getAllOwners());
    }

    @GetMapping("/{ownerId}")
    public ResponseEntity<Owner> getOwner(@PathVariable Long ownerId){
        return ResponseEntity.ok(ownerService.getOwner(ownerId));
    }

    @PostMapping("/add")
    public ResponseEntity<Owner> createOwner(@Valid @RequestBody RequestOwnerDTO request){
        return ResponseEntity.status(HttpStatus.CREATED).body(ownerService.createOwner(request));
    }

}
