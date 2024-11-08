package com.mphasis.eBookStore_Spring_Cloud_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class EBookStoreSpringCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBookStoreSpringCloudGatewayApplication.class, args);
	}

}
