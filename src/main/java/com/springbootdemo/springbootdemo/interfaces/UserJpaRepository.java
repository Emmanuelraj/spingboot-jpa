package com.springbootdemo.springbootdemo.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springbootdemo.springbootdemo.model.User;

public interface UserJpaRepository extends JpaRepository<User, Long>{
	
	User findByName(String name);

}
