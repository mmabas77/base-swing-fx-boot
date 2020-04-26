package com.mmabas77.baseswingfxboot.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Configuration
@Profile("prod")
@PropertySource("classpath:prod.properties")
public class ProdConfig {
    
}
