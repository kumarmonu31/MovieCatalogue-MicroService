package com.microserice.demo.moviecatalogservice.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
@Component
public class RestTemplateConfig {
    @Bean
    @LoadBalanced
    private RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
