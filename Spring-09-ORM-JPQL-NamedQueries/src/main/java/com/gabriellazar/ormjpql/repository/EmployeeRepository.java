package com.gabriellazar.ormjpql.repository;


import com.gabriellazar.ormjpql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {


    @Query("SELECT e from Employee e where e.email = 'dtrail@tamu.edu'")
    Employee getEmployeeDetails();

    @Query("SELECT e.salary FROM Employee e where e.email = 'dtrail@tamu.edu'")
    Employee getEmployeeSalary();

    @Query("SELECT e from Employee e where e.email = ?1")
    Employee getEmployeeDetailsByEmail(String name);

    @Query("SELECT e from Employee e where e.email = ?1 AND e.salary = ?2")
    Employee getEmployeeDetailsByEmailAndSalary(String name, int salary);

}
