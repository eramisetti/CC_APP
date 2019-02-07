/**
 * 
 */
package com.cc.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author Eswar Ramisetti
 *
 */
@Controller
public class HomePageController {
	
	Logger logger = LoggerFactory.getLogger(HomePageController.class); 
	
	@GetMapping(value = "/")
	public String home() {
		return "forward:/index.html";
	}
	

}
