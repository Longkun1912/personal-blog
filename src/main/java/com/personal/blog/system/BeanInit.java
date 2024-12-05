package com.personal.blog.system;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanInit {
    @Bean
    public ModelMapper modelMapper() {
        return new ModelMapper();
    }
}
