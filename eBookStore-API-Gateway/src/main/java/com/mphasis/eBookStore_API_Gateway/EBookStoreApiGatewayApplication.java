package com.mphasis.eBookStore_API_Gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EBookStoreApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EBookStoreApiGatewayApplication.class, args);
	}

}
