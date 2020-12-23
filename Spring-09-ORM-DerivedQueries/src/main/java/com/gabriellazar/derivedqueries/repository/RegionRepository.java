package com.gabriellazar.derivedqueries.repository;

import com.gabriellazar.derivedqueries.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region,Long> {

    List<Region> findAllByCountry(String country);

    List<Region> findDistinctByCountry(String country);

    List<Region> findByCountryContaining(String country);

    List<Region> findByCountryContainingOrderByRegion(String country);

    List<Region> findTop2ByCountry(String country);
}
