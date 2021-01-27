package com.gabriellazar.rest.controller;

import com.gabriellazar.rest.entity.Product;
import com.gabriellazar.rest.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public @ResponseBody  Product getProduct(@PathVariable("id") long id){
        return productService.getProduct(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<Product> getProducts(){
        return productService.getProducts();
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public @ResponseBody List<Product> deleteProducts(long id){
        productService.delete(id);
        return productService.getProducts();
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody Product createProduct(@RequestBody Product product){
       return productService.createProduct(product);

    }

    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public @ResponseBody Product updateProduct(@PathVariable(value = "id") long id, @RequestBody Product product){
      return productService.updateProduct(id,product);

    }

}
