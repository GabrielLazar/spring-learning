package com.gabriellazar.webclient.service;

import com.gabriellazar.webclient.entity.Product;
import org.springframework.stereotype.Component;
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
