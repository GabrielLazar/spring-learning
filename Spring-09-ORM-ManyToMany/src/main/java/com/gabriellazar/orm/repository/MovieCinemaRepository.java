package com.gabriellazar.orm.repository;

import com.gabriellazar.orm.model.MovieCinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieCinemaRepository extends JpaRepository<MovieCinema,Long> {
}
