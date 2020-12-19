package com.gabriellazar.orm.repository;

import com.gabriellazar.orm.model.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema,Long> {
}
