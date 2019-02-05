package com.cc.springboot.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cc.springboot.dao.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserNameAndPassword(String userName, String password);
	
	@Query(value = "SELECT u FROM User u WHERE u.password=:password AND (u.corpEmail=:corpEmail OR u.personalEmail=:personalEmail)")
	User findByCorpEmailOrPersonalEmailAndPassword(String corpEmail, String personalEmail, String password);

}
