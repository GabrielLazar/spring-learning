package com.gabriellazar.webclient.controllers;


import com.gabriellazar.webclient.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping("/mono-flux")
public class ConsumeMonoFluxController {

    String baseUrl = "http://localhost:8082/api/product";

    WebClient webClient = WebClient.builder().baseUrl(baseUrl).build();

    @GetMapping("/{id}")
    public Mono<Product> consumeMono(@PathVariable Long id){

        return webClient
                .get()
                .uri("/mono/" +id )
                .retrieve()
                .bodyToMono(Product.class);

    }

    @GetMapping("/flux/{id}")
    public Flux<Product> consumeFlux(@PathVariable Long id){

        return webClient
                .get()
                .uri("/flux/" +id )
                .retrieve()
                .bodyToFlux(Product.class);

    }

}