package com.media.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication

public class DiscoveryServerApplication {

	public static void main(String[] args) {
		try {
			SpringApplication.run(DiscoveryServerApplication.class, args);
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}


}
