/**
 * 
 */
package com.pcd.springcloud.web.service;
import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.pcd.springcloud.web.model.User;
import com.pcd.springcloud.web.service.impl.UserServiceHystric;

/**o
 * @author TimiQ
 *
 */
//绑定該接口到{服务名称，通过config管理}服务，并通知Feign组件对该接口进行代理（不需要编写接口实现）
@FeignClient(value="Spring-Cloud-Server",fallback=UserServiceHystric.class)
public interface  UserServiceByFeign {
	 @RequestMapping(value="/user/getAllUsers",method=RequestMethod.GET)
	    List<User> getAllUsers();
}
