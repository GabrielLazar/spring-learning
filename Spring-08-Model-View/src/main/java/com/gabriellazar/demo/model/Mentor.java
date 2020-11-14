package com.gabriellazar.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class Mentor {

    private String firstName;
    private String lastName;
    private int age;
    private Gender gender;

}
