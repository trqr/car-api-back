package com.gretacvdl.car_api.repositories;

import com.gretacvdl.car_api.models.Feature;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FeatureRepository extends JpaRepository<Feature, Long> {
}
