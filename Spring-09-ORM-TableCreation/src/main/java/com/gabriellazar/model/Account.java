package com.gabriellazar.model;

import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class Account {

    @Id
    private Long id;
    private String owner;
    private double balance;

}
