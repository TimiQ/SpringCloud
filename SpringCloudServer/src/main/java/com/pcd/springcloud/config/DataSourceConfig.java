/**
 * 
 */
package com.pcd.springcloud.config;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author TimiQ
 *
 */
@Configuration
public class DataSourceConfig {
	/**
	 * 
	 * 描述：获取数据源
	 * 
	 * 方法：getDataSource
	 * 
	 * 类名：MyBatisConfig.java
	 *
	 */
	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource getDataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		return dataSource;
	}
}
