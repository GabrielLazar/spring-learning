package com.gabriellazar.derivedqueries.repository;

import com.gabriellazar.derivedqueries.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    List<Department> findByDepartment(String department);
    List<Department> findByDivision(String division);

    List<Department> findByDivisionEquals(String division);
    List<Department> findByDepartmentEndsWith(String endPattern);

    List<Department> findDistinctTop3ByDivisionContaining(String pattern);

}
