package com.warmme.study.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Hello world!
 *
 */
@SpringCloudApplication
@EnableZuulProxy
public class ZuulApp {
	public static void main(String[] args) {
		 SpringApplication.run(ZuulApp.class, args);
	}
}
