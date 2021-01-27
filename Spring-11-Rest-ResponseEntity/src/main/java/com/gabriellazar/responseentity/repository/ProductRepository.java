package com.gabriellazar.responseentity.repository;


import com.gabriellazar.responseentity.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
