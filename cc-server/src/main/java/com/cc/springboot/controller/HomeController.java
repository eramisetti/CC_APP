/**
 * 
 */
package com.cc.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.cc.springboot.model.User;

/**
 * @author Eswar Ramisetti
 *
 */
@Controller
public class HomeController {
	
	@GetMapping("/")
	public String home() {
		return "forward:/index.html";
	}
	
	@PostMapping(path = "/api/login" , consumes = "application/json", produces = "application/json")
	public Boolean login(@RequestBody User user) {
		return true;
	}

}
