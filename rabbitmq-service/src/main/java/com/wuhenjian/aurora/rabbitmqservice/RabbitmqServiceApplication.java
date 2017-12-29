package com.wuhenjian.aurora.rabbitmqservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@EnableFeignClients
@EnableEurekaClient
@SpringBootApplication
public class RabbitmqServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RabbitmqServiceApplication.class, args);
	}
}
