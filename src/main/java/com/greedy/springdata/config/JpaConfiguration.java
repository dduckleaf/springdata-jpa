package com.greedy.springdata.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EntityScan(basePackages = "com.greedy.lucky")
@EnableJpaRepositories(basePackages = "com.greedy.springdata")
public class JpaConfiguration {
}
