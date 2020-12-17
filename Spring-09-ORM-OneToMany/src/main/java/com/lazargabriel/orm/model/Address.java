package com.lazargabriel.orm.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
public class Address {

    @Id
    private Long id;
    private String street;
    private String zipCode;

    @ManyToOne
    private Person person;
}
