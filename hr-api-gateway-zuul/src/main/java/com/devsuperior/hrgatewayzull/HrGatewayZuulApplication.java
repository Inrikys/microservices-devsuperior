package com.devsuperior.hrgatewayzull;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
public class HrGatewayZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(HrGatewayZuulApplication.class, args);
    }

}
