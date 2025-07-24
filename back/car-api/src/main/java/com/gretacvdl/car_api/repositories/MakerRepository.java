package com.gretacvdl.car_api.repositories;

import com.gretacvdl.car_api.models.Maker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MakerRepository extends JpaRepository<Maker, Long> {
}
