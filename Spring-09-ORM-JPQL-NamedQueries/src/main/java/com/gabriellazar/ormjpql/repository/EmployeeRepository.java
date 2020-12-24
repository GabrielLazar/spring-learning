package com.gabriellazar.ormjpql.repository;


import com.gabriellazar.ormjpql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;


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

    @Query("SELECT e FROM Employee e WHERE e.salary = :salary")
    Employee getEmployeeBySalary(@Param("salary") int salary);

    @Query("SELECT e FROM Employee e WHERE e.first_name = :firstName OR e.salary = :salary")
    Employee getEmployeeBySFirstNameOrSalary(@Param("salary") int salary,@Param("firstName") String firstName);

    @Query("SELECT E FROM Employee e WHERE e.salary > ?1")
    List<Employee> getEmployeeBySalaryGreaterThan(Integer salary);

    @Query("SELECT E FROM Employee e WHERE e.salary BETWEEN ?1 AND ?2")
    List<Employee> getEmployeeBySalaryBetween(int salary1, int salary2);

    @Query(value = "SEELCT * FROM employees WHERE salary = ?1",nativeQuery = true)
    Employee readEmployeeBySalary(int salary);

    @Transactional
    @Modifying
    @Query("UPDATE Employee e SET e.email = :email WHERE e.id = :id")
    void UpdateEmployeeJPQL(@Param("id") Integer id, @Param("email") String email);
    
    @Modifying
    @Transactional
    @Query(value = "UPDATE employees  SET email = :email WHERE id = :id",nativeQuery = true)
    void UpdateEmployeeJPQLNative(@Param("id") Integer id, @Param("email") String email);

}
