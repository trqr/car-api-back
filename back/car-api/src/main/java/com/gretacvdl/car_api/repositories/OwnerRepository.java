package com.gretacvdl.car_api.repositories;

import com.gretacvdl.car_api.models.Owner;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OwnerRepository extends JpaRepository<Owner, Long> {
    Owner findByEmail(String email);

    boolean existsByEmail(String email);
}
