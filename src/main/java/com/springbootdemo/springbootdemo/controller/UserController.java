package com.springbootdemo.springbootdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springbootdemo.springbootdemo.interfaces.UserJpaRepository;
import com.springbootdemo.springbootdemo.model.User;

@RestController
public class UserController 
{
	  @Autowired
	  private UserJpaRepository userJpaRepository;
	
	   @GetMapping(value="/all")
	   public List<User>findAll()
	   {
		     return userJpaRepository.findAll();
	   }

	   
	   @GetMapping(value="/{name}")
	   public User findByName(@PathVariable("name") String name)
	   {
		   
		   return userJpaRepository.findByName(name);
	   }
	   
	   @PostMapping("/load")
	   public User load(@RequestBody final User user)
	   {  
		   
		   
		   userJpaRepository.save(user);
		   
		   return userJpaRepository.findByName(user.getName());
	   }
	   }
