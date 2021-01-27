package com.gabriellazar.responseentity.controller;


import com.gabriellazar.responseentity.entity.Product;
import com.gabriellazar.responseentity.entity.ResponseWrapper;
import com.gabriellazar.responseentity.service.ProductService;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
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
    public ResponseEntity<Product> getProduct(@PathVariable("id") long id) {

        return ResponseEntity.ok().body(productService.getProduct(id));
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product) {
        Product prod = productService.createProduct(product);
        return ResponseEntity.status(HttpStatus.CREATED).header("verion", "v1").body(prod);
    }

    @GetMapping
    public ResponseEntity<List<Product>> getProducts() {

        HttpHeaders header = new HttpHeaders();
        header.set("verion", "v1");
        return ResponseEntity.ok().headers(header).body(productService.getProducts());
    }

    @DeleteMapping
    public ResponseEntity<List<Product>> deleteProducts(long id) {
        MultiValueMap<String, String> map = new LinkedMultiValueMap<>();
        map.add("verion", "v1");
        map.add("operation", "delete");
        productService.delete(id);

        return new ResponseEntity<>(productService.getProducts(), map, HttpStatus.OK);
    }


    @PutMapping(value = "/{id}")
    public ResponseEntity<ResponseWrapper> updateProduct(@PathVariable(value = "id") long id, @RequestBody Product product) {

        Product p = productService.updateProduct(id, product);
        return ResponseEntity.ok( new ResponseWrapper("Product Successfully Updated",p,HttpStatus.OK));

    }

}
