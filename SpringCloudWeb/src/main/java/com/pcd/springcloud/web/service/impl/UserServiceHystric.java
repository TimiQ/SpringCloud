/**
 * 
 */
package com.pcd.springcloud.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.pcd.springcloud.web.model.User;
import com.pcd.springcloud.web.service.UserServiceByFeign;

/**
 * @author TimiQ
 *
 */
@Component
public class UserServiceHystric implements UserServiceByFeign {
	
	/* (non-Javadoc)
	 * @see com.pcd.springcloud.web.service.UserServiceByFeign#getAllUsers()
	 */
	@Override
	public List<User> getAllUsers() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setName("测试人员");
		user.setCity("请求的Server无法找到");
		list.add(user);
		return list;
	}
	
}
