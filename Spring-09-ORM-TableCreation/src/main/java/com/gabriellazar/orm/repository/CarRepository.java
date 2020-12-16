package com.gabriellazar.orm.repository;

import com.gabriellazar.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car,Long> {
}
