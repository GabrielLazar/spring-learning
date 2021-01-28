package com.gabriellazar.resttemplate.controller;

import com.gabriellazar.resttemplate.entity.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.*;

@RestController
public class HomeController {

    final String URI = "https://jsonplaceholder.typicode.com/users";

    private RestTemplate restTemplate;

    public HomeController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping
    public User [] getAllUsers(){
      ResponseEntity<User[]> responseEntity = restTemplate.getForEntity(URI,User[].class);
      return responseEntity.getBody();
    }

    @GetMapping("/{id]")
    public Object getUserById(@PathVariable(value = "id") Long id){
        String URI = this.URI + "/{id]";
        return restTemplate.getForObject(URI,Object.class,id);
    }

    @GetMapping("/test")
    public ResponseEntity<Object> consumePostForDummy(){
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.set("app-id","lTE5abbDxdjGplutvTuc");

        HttpEntity<String> httpEntity = new HttpEntity<>(headers);
        String URI = this.URI + "?limit=10";
        ResponseEntity<Object> responseEntity = restTemplate.exchange(URI, HttpMethod.GET,httpEntity,Object.class);
        return responseEntity;
    }

}
