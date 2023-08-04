package com.develop.api.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.ModelMap;

@Configuration
public class ModelMapperConfig {

    @Bean
    private ModelMapper mapper() {
        return new ModelMapper();
    }
}
