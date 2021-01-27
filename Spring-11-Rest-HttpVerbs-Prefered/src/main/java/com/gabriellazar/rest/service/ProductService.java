package com.gabriellazar.rest.service;

import com.gabriellazar.rest.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    Product getProduct(long id);
    List<Product> getProducts();
    void delete(long id);
    Product updateProduct(long id, Product product);
    Product createProduct(Product product);

}
