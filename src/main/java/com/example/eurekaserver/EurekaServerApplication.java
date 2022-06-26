package com.example.eurekaserver;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@EnableEurekaServer
@Slf4j
public class EurekaServerApplication {

	@Value("${server.port}")
	private String serverPort;

	private static String serverPortStatic;

	@Value("${server.port}")
	public void setServerPortStatic(String serverPort) {
		EurekaServerApplication.serverPortStatic = serverPort;
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerApplication.class, args);
		log.info("Eureka Server runnig on port: " + serverPortStatic);
	}

}
