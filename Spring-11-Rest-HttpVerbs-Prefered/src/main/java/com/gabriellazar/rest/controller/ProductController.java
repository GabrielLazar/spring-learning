package com.gabriellazar.rest.controller;

import com.gabriellazar.rest.entity.Product;
import com.gabriellazar.rest.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable("id") long id){
        return productService.getProduct(id);
    }

    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    @DeleteMapping
    public List<Product> deleteProducts(long id){
        productService.delete(id);
        return productService.getProducts();
    }

    @PostMapping
    public Product createProduct(@RequestBody Product product){
       return productService.createProduct(product);

    }

    @PutMapping(value = "/{id}")
    public Product updateProduct(@PathVariable(value = "id") long id, @RequestBody Product product){
      return productService.updateProduct(id,product);

    }

}
