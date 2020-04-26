package com.mmabas77.baseswingfxboot.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories(basePackages = "com.mmabas77.baseswingfxboot.repo")
@EntityScan(basePackages = "com.mmabas77.baseswingfxboot.model.db")
@EnableTransactionManagement
public class AppConfig {
}
