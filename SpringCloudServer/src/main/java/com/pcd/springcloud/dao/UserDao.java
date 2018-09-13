/**
 * 
 */
package com.pcd.springcloud.dao;

import java.util.List;

import com.pcd.springcloud.model.User;

/**
 * @author TimiQ
 *
 */
public interface UserDao {
	int deleteByPrimaryKey(Integer id);
	
	int insert(User record);
	
	int insertSelective(User record);
	
	User selectByPrimaryKey(Integer id);
	
	int updateByPrimaryKeySelective(User record);
	
	int updateByPrimaryKey(User record);
	
	List<User> getAllUsers();
}
