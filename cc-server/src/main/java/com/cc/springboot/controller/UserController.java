/**
 * 
 */
package com.cc.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
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
	
	@RequestMapping(value = "/")
	public String home() {
		return "index.html";
	}
	
	
	@PostMapping("/api/user/login")
	public @ResponseBody ResponseEntity<Boolean> login(@RequestBody User user) {
		logger.debug("Controller(): login(): Entry.");
		return new ResponseEntity<Boolean>(userService.login(user),HttpStatus.OK);
	}
	
	@PostMapping("/api/user/register")
	public @ResponseBody ResponseEntity<User> register(@RequestBody User user) {
		logger.debug("Controller(): register(): Entry.");
		return new ResponseEntity<User>(userService.register(user), HttpStatus.CREATED);
	}

}
