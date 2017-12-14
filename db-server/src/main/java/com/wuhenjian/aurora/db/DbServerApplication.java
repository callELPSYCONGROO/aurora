package com.wuhenjian.aurora.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author 無痕剑
 * @date 2017/12/8 11:23
 */
@EnableEurekaClient
@SpringBootApplication
public class DbServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbServerApplication.class, args);
	}
}
