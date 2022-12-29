package com.virtusa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.virtusa.model.UserModel;
import com.virtusa.service.AccountService;

public class CustomerController {
	@Autowired
	AccountService accountservice;
	
	@GetMapping("pavan")
	public String getString() {
		return 	"Welcome to the service Bnaking";
	}
	
	@GetMapping("/user")
	public List<UserModel> getAllUsersAdress(){
		return accountservice.getAllUsersAdress();
	}
	
	@GetMapping("/user/{id}")
	public List<UserModel> getUserById(@PathVariable int id){
		return accountservice.getById(id);
	}
	
	@GetMapping("/usersName/{name}")
	public List<UserModel> getUserByName(@PathVariable("name") String name){
		return accountservice.getByName(name);
	}
	

}
