/**
 * 
 */
package com.pcd.springcloud;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.event.Level;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import brave.sampler.Sampler;

/**
 * @author TimiQ
 *
 */
@SpringBootApplication
@EnableEurekaClient
// 开启Feign功能
@EnableFeignClients
@RestController
@RefreshScope
@EnableDiscoveryClient
public class WebApplication {
	 private static final Logger LOG = LoggerFactory.getLogger(WebApplication.class.getName());

	@Value("${system.flag}")
	String flag;
	public static void main(String[] args) {
		SpringApplication.run(WebApplication.class, args);
	}
	
	@RequestMapping(value = "/system")
	public String system() {
		 LOG.info("calling trace : system");
		return flag;
	}
	@Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
	// @LoadBalanced // 开启软负载均衡
	// @Bean
	// RestTemplate restTemplate() {
	// return new RestTemplate();
	// }
	//
	// @Bean
	// @Scope("prototype")
	// public Feign.Builder feignBuilder() {
	// return Feign.builder();
	// }
	//
	// @Bean
	// public Logger.Level feignLogger() {
	// return Logger.Level.FULL;
	// }
	//
	// @Bean
	// public Request.Options options() {
	// return new Request.Options(FIVE_SECONDS, FIVE_SECONDS);
	// }
	
}
