package com.lazargabriel.orm.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "persons")
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long personId;
    private String firstName;
    private String lastName;

    @OneToMany(mappedBy = "person",cascade = CascadeType.ALL)
    private List<Address> address;
}
