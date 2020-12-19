package com.gabriellazar.orm.repository;

import com.gabriellazar.orm.model.Genre;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GenreRepository extends JpaRepository<Genre,Long> {
}
