package com.wuhenjian.aurora.gameservice;

import feign.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class GameServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(GameServiceApplication.class, args);
    }

    @Bean
    public Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
