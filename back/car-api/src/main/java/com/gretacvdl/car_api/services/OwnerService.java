package com.gretacvdl.car_api.services;

import com.gretacvdl.car_api.dtos.RequestOwnerDTO;
import com.gretacvdl.car_api.models.Owner;
import com.gretacvdl.car_api.repositories.OwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerService {

    @Autowired
    private OwnerRepository ownerRepository;

    public List<Owner> getAllOwners(){
        return ownerRepository.findAll();
    }

    public Owner getOwner(Long ownerId){
        if (!ownerRepository.existsById(ownerId)){
            throw new IllegalArgumentException("le propriétaire ${ownerId} nexiste pas !");
        }
        return ownerRepository.getReferenceById(ownerId);
    }

    public Owner createOwner(RequestOwnerDTO request){
        Owner newOwner = new Owner(request.getName(), request.getEmail());
        return ownerRepository.save(newOwner);
    }
}
