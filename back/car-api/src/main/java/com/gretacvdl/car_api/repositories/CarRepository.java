package com.gretacvdl.car_api.repositories;

import com.gretacvdl.car_api.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
