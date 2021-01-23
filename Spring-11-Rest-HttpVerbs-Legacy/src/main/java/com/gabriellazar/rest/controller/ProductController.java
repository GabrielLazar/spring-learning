package com.gabriellazar.rest.controller;

import com.gabriellazar.rest.entity.Product;
import com.gabriellazar.rest.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.GET)
    public @ResponseBody  Product getProduct(@PathVariable("id") long id){
        return productService.getProduct(id);
    }

    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public @ResponseBody List<Product> getProducts(){
        return productService.getProducts();
    }
}
