package com.gretacvdl.car_api.controllers;

import com.gretacvdl.car_api.models.Owner;
import com.gretacvdl.car_api.services.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
