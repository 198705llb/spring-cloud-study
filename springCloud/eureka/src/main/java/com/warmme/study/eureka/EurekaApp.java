package com.warmme.study.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Hello world!
 */
@EnableEurekaServer
@SpringBootApplication
public class EurekaApp {
    public static void main(String[] args) {
//    	SpringApplication.run(App.class, args);
        new SpringApplicationBuilder(EurekaApp.class).web(true).run(args);
    }
}
