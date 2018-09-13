/**
 * 
 */
package com.pcd.springcloud.web.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pcd.springcloud.web.model.User;
import com.pcd.springcloud.web.service.UserService;

/**
 * @author TimiQ
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;

	
	@ResponseBody
	@RequestMapping(value = "/getUsers")
	public ResponseEntity<List<User>> getUsers() {
		return new ResponseEntity<List<User>>(userService.getUsers(""), HttpStatus.OK);
	}
}
