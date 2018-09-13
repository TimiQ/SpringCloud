/**
 * 
 */
package com.pcd.springcloud.web.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.pcd.springcloud.web.model.User;

/**
 * @author TimiQ
 *
 */
@Service
public class UserService {
	
	@Autowired
	RestTemplate restTemplate;
	@HystrixCommand(fallbackMethod = "callError")
	public List<User> getUsers(String name) {
		return restTemplate.getForObject("http://SPRING-CLOUD-SERVER/user/getAllUsers", List.class);
	}
	public List<User> callError(String name) {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setName("测试人员");
		list.add(user);
        return list;
    }
}
