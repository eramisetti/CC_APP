/**
 * 
 */
package com.cc.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cc.springboot.dao.entity.User;
import com.cc.springboot.service.UserService;


/**
 * @author Eswar Ramisetti
 *
 */
@RestController
public class UserController {
	
	Logger logger = LoggerFactory.getLogger(UserController.class); 
	
	@Autowired
	UserService userService;
	
	@GetMapping(value = "/")
	public String home() {
		return "forward:/index.html";
	}
	
	@PostMapping("/api/user/login")
	public Boolean login(@RequestBody User user) {
		logger.debug("Controller(): login(): Entry.");
		return userService.login(user);
	}
	
	@PostMapping("/api/user/register")
	public User register(@RequestBody User user) {
		logger.debug("Controller(): register(): Entry.");
		return userService.register(user);
	}

}
