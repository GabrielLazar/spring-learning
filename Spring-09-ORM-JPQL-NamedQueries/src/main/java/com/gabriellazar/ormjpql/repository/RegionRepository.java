package com.gabriellazar.ormjpql.repository;

import com.gabriellazar.ormjpql.entity.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepository extends JpaRepository<Region,Long> {

    List<Region> retrieveRegionByCountry(String country);

    List<Region> getAllRegions();

    @Query(nativeQuery = true)
    List<Region> getRegionLike(String pattern);
}
