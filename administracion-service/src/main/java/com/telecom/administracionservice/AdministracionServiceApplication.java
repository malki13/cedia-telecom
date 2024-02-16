package com.telecom.administracionservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdministracionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdministracionServiceApplication.class, args);
	}

}
