package com.linjingc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class WebApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}

	@RequestMapping("helloword")
	public String helloworld(HttpServletRequest request) {
		return "helloword";
	}
	@RequestMapping("/")
	public String index(HttpServletRequest request) {
		return "index";
	}
}
