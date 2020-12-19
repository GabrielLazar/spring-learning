package com.gabriellazar.orm.repository;

import com.gabriellazar.orm.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long> {
}
