package com.gabriellazar.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Car {

    @Id
    private int id;

    private String make;
    private String model;
}
