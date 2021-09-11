package com.ex.datadog.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.redis.core.StringRedisTemplate;

import lombok.Data;

@Configuration
@Data
public class AppConfig {

    @Bean(name = "getStringRedisTemplate")
    @Primary
    public StringRedisTemplate getStringRedisTemplate() {
        return new StringRedisTemplate();
    }

}
