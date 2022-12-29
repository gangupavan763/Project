package com.virtusa.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.virtusa.model.UserModel;

public class AccountService {
	public List<UserModel> getAllUsersAdress() {
		
		List<UserModel> users = new ArrayList<UserModel>();
		users.add(new UserModel(1, "kumar ", "gangupavan@gmail.com"));
		users.add(new UserModel(2, "pavan", "gangupavan@gmail.com"));
		users.add(new UserModel(3, "asok", "gangupavan@gmail.com"));
		users.add(new UserModel(4, "kali", "gangupavan@gmail.com"));
		return users;
	}

	public List<UserModel> getById(int id) {
		return getAllUsersAdress().stream().filter(user -> user.getId() == id).collect(Collectors.toList());
	}

	public List<UserModel> getByName(String name) {
		return getAllUsersAdress().stream().filter(userName -> userName.getName().startsWith(name)).collect(Collectors.toList());
	}
}
