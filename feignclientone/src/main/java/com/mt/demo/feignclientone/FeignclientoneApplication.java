package com.mt.demo.feignclientone;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringCloudApplication
@EnableFeignClients
public class FeignclientoneApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignclientoneApplication.class, args);
	}
}
