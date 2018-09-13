/**
 * 
 */
package com.pcd.springcloud.web.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.pcd.springcloud.web.model.User;
import com.pcd.springcloud.web.service.UserServiceByFeign;

/**
 * @author TimiQ
 *
 */
public class UserServiceByFeignImpl implements UserServiceByFeign {

	@Override
	public List<User> getAllUsers() {
		 return new ArrayList<User>();
	}
	
}
