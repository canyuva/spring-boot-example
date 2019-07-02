package com.example.canyuva;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    public AppConfig(){}

    @Bean
    public CarCreator carCreator(){
        return CarCreator.INSTANCE;
    }

}
