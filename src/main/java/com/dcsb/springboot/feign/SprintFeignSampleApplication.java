package com.dcsb.springboot.feign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SprintFeignSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(SprintFeignSampleApplication.class, args);
	}

}
