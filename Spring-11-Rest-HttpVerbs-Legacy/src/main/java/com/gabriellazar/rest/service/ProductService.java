package com.gabriellazar.rest.service;

import com.gabriellazar.rest.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product getProduct(long id);
    List<Product> getProducts();
    List<Product> delete(long id);
    List<Product> updateProduct(long id, Product product);
    List<Product> createProduct(Product product);

}
