package com.gabriellazar.ormjpql.repository;


import com.gabriellazar.ormjpql.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartmentRepository extends JpaRepository<Department,Long> {


}
