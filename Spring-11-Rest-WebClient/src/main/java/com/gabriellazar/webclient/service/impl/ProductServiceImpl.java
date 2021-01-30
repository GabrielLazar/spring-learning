package com.gabriellazar.webclient.service.impl;



import com.gabriellazar.webclient.entity.Product;
import com.gabriellazar.webclient.repository.ProductRepository;
import com.gabriellazar.webclient.service.ProductService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product getProduct(long id) {
        return productRepository.findById(id).get();
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
