package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 启动类<br>
 * 注册中心
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class ServerApp {
	public static void main(String[] args) {
		SpringApplication.run(ServerApp.class, args);
	}
}
