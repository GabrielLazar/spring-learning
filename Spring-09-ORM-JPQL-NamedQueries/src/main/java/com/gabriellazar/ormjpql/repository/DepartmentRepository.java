package com.gabriellazar.ormjpql.repository;


import com.gabriellazar.ormjpql.entity.Department;
import com.gabriellazar.ormjpql.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {

    @Query("SELECT d FROM Department d WHERE d.division IN ?1")
    List<Department> getDepartmentByDivisionIn(List<String> division);

    @Query("SELECT d FROM Department d ORDER BY d.division")
    List<Employee> getDepartmentByDivisionOrderAsc();

}
