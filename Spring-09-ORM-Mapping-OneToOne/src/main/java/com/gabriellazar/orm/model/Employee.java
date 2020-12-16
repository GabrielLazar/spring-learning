package com.gabriellazar.orm.model;

import com.fasterxml.jackson.databind.ser.Serializers;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@Table(name = "employees")
public class Employee  extends BaseEntity {


    private String firstName;
    private String lastName;
    private String email;
    @Column(columnDefinition = "DATE")
    private LocalDate hireDate;
    private String Gender;
    private int salary;

    public Employee(String firstName, String lastName, String email, LocalDate hireDate, String gender, int salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.hireDate = hireDate;
        Gender = gender;
        this.salary = salary;
    }
}
