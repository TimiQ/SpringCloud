/**
 * 
 */
package com.pcd.springcloud.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pcd.springcloud.dao.UserDao;
import com.pcd.springcloud.model.User;

/**
 * @author TimiQ
 *
 */
@Service
public class UserService {
	@Autowired
    private UserDao userDao;

    public int addUser(User user){
        return userDao.insert(user);
    }

    public User getUserById(int id){
        return userDao.selectByPrimaryKey(id);
    }

    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
}
