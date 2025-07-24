package com.gretacvdl.car_api.repositories;

import com.gretacvdl.car_api.models.CarModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CarModelRepository extends JpaRepository<CarModel, Long> {
    public List<CarModel> findAllByMakerId(Long makerId);
}
