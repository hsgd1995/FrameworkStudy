package com.tang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 启动类<br>
 * 配置中心-客户端<br>
 * 注册到注册中心
 * @author Administrator
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConfigClientApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigClientApplication.class, args);
	}
}
