package com.gretacvdl.car_api.repositories;

import com.gretacvdl.car_api.models.Registration;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RegistrationRepository extends JpaRepository<Registration, Long> {
}
