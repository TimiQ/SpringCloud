/**
 * 
 */
package com.pcd.springcloud.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pcd.springcloud.model.User;
import com.pcd.springcloud.service.UserService;

/**
 * @author TimiQ
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@Resource
	private DiscoveryClient client;
	
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	@ResponseBody
	public int addUser(@RequestBody User user) {
		return userService.addUser(user);
	}
	
	@RequestMapping(value = "/getUserById", method = RequestMethod.GET)
	@ResponseBody
	public User getUserById() {
		return userService.getUserById(1);
	}
	
	@RequestMapping(value = "/getAllUsers", method = RequestMethod.GET)
	@ResponseBody
	public List<User> getAllUsers() {
		List<User> listUser = userService.getAllUsers();
		// 获取服务信息
		List<String> instance = client.getServices();
		// 输出服务信息
		for(int i=0;i<instance.size();i++) {
			logger.info("uri={}，serviceId={}，result={}", instance.get(i), listUser);
		}
		return listUser;
	}
}
