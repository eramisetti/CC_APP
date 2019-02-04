package com.cc.springboot.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cc.springboot.dao.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	User findByUserNameAndPassword(String userName, String password);

}