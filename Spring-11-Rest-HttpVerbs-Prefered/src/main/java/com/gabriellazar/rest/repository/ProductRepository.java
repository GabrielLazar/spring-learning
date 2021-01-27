package com.gabriellazar.rest.repository;


import com.gabriellazar.rest.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
