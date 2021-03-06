package com.gabriellazar.config;

import com.gabriellazar.implementation.Java;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.gabriellazar")
public class AppConfig {

    @Bean
    public Java java(){
        return  new Java();
    }
}
