package com.gabriellazar.rest.service.impl;

import com.gabriellazar.rest.entity.Product;
import com.gabriellazar.rest.repository.ProductRepository;
import com.gabriellazar.rest.service.ProductService;
import org.springframework.beans.BeanUtils;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.getOne(id);
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public void delete(long id) {
        productRepository.deleteById(id);
    }

    @Override
    public Product updateProduct(long id, Product product) {
        Product prod = getProduct(id);
        BeanUtils.copyProperties(product, prod);
        return productRepository.saveAndFlush(prod);

    }

    @Override
    public Product createProduct(Product product) {
        return productRepository.saveAndFlush(product);

    }
}
