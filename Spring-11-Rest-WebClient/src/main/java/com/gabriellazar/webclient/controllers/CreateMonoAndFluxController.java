package com.gabriellazar.webclient.controllers;

import com.gabriellazar.webclient.entity.Product;
import com.gabriellazar.webclient.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/product")
public class CreateMonoAndFluxController {

    ProductService productService;

    public CreateMonoAndFluxController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/mono/{id}")
    public Mono<Product> getMonoProd(@PathVariable Long id){
        return Mono.just(productService.getProduct(id));
    }

    @GetMapping("/flux/{id}")
    public Flux<Product> getFluxProd(@PathVariable Long id){
        return Flux.just(productService.getProduct(id));
    }
}
