package com.example.RentalService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateClass {

    @Bean
    public RestTemplate restTemplate(){
        return restTemplate();
    }
}
