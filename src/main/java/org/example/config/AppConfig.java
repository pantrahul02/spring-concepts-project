package org.example.config;

import org.example.beans.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "org.example")
public class AppConfig {

    /*@Bean
    public Vehicle car() {
        return new Car();
    }

    @Bean
    public Vehicle bike() {
        return new Bike();
    }

    @Bean
    public Vehicle cycle() {
        return new Cycle();
    }

    @Bean
    public Traveler traveler(){
        return new Traveler(cycle());
    }*/
}
