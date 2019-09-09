/**
 * 
 */
package com.pcd.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;

import brave.sampler.Sampler;

/**
 * @author TimiQ
 *
 */
@SpringBootApplication
// 只需要一个注解即开启了配置服务的管理
@EnableConfigServer
@EnableEurekaClient
public class ConfigApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class, args);
    }
// 我是最新的都别惹我
    
    
//  This is error 
    
/**** 你是大哥，我排在你后面 **/    
    
//  就是这行发生的冲突
    
//  我们不一样、不一样
    
    @Bean
    public Sampler defaultSampler() {
        return Sampler.ALWAYS_SAMPLE;
    }
}
