package com.gretacvdl.car_api.services;

import com.gretacvdl.car_api.models.Maker;
import com.gretacvdl.car_api.repositories.MakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MakerService {

    @Autowired
    private MakerRepository makerRepository;

    public List<Maker> getMakers(){
        return makerRepository.findAll();
    }
}
