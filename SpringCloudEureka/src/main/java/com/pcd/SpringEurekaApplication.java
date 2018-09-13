/**
 * 
 */
package com.pcd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

/**
 * @author TimiQ
 *
 */
@EnableEurekaServer
@SpringBootApplication
@RefreshScope
public class SpringEurekaApplication {
	
	/**
	 * 描述：
	 * 
	 * 方法：main
	 * 
	 * 类名：SpringEurekaApplication.java
	 * 
	 */
	public static void main(String[] args) {
		SpringApplication.run(SpringEurekaApplication.class, args);
	}
	
	@Bean
	public Sampler defaultSampler() {
		return Sampler.ALWAYS_SAMPLE;
	}
}
