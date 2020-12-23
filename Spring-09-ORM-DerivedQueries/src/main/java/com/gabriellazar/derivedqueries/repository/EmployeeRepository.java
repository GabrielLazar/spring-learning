package com.gabriellazar.derivedqueries.repository;

import com.gabriellazar.derivedqueries.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long> {

    List<Employee> findByEmail(String email);

    List<Employee> findByFirst_nameAndLast_nameOrEmail(String firstName,String lastName, String email);

    List<Employee> findByFirst_nameNot(String firstName);

    List<Employee> findByLast_nameContaining(String lastName);

    List<Employee> findBySalaryGreaterThan(Integer salary);

    List<Employee> findBySalaryLessThan(Integer salary);

    List<Employee> findByHire_dateBetween(LocalDate start, LocalDate end);

    List<Employee> findBySalaryIsGreaterThanEqualsOrderBySalaryDesc(Integer salary);

    List<Employee> findDistinctTop3BySalaryIsLessThan(Integer Salary);

    List<Employee> findByEmailIsNull();
}
