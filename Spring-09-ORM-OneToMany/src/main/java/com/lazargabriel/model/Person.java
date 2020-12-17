package com.lazargabriel.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "person")
    private List<Address> address;
}
