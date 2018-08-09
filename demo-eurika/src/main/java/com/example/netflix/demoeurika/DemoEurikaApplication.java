package com.example.netflix.demoeurika;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class DemoEurikaApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoEurikaApplication.class, args);
    }
}
