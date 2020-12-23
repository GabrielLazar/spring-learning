package com.gabriellazar.derivedqueries.entity;

import com.gabriellazar.derivedqueries.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@ToString
public class Employee extends BaseEntity{

    private String first_name;
    private String last_name;
    private String email;

    @Column(columnDefinition = "DATE")
    private LocalDate hire_date;

    private Integer salary;
    @Enumerated(EnumType.STRING)
    private Gender gender;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "department")
    private Department department;

    @ManyToOne(fetch = FetchType.LAZY)
    private Region region;
}
