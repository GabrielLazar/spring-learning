package com.gabriellazar.derivedqueries.entity;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "Regions")
public class Region extends BaseEntity{

    private String region;
    private String country;
}
