package com.gabriellazar.orm.model;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Regions")
public class Region extends BaseEntity{

    private String region;
    private String country;

    @OneToOne(mappedBy = "region")
    private Employee employee;
}
