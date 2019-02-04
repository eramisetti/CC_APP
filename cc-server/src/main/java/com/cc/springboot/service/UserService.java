/**
 * 
 */
package com.cc.springboot.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cc.springboot.dao.entity.User;
import com.cc.springboot.dao.repository.UserRepository;


/**
 * @author Eswar Ramisetti
 *
 */
@Service
public class UserService {
	
	Logger logger = LoggerFactory.getLogger(UserService.class); 
	
	@Autowired
	UserRepository userRepository;
	
	public Boolean login(User user) {
		logger.debug("inside login() ");
		User result = userRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());
		if(result != null) {
			logger.debug("Results " + result.getCorpEmail());
			return true;
		}
		return false;
	}
	
	public User register(User user) {
		logger.debug("inside register() ");
		User result = userRepository.save(user);
		if(result != null) {
			logger.debug("Registration successfull :  " + result.getId());
		}
		return result;
	}

}
