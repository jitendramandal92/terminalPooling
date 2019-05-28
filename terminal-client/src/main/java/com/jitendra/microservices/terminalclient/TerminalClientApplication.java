package com.jitendra.microservices.terminalclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TerminalClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TerminalClientApplication.class, args);
	}

}