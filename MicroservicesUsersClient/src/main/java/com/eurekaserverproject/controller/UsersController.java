package com.eurekaserverproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eurekaserverproject.entity.Users;
import com.eurekaserverproject.service.UsersServiceImpl;

@RestController
public class UsersController {
	@Autowired
	public UsersServiceImpl usrsImpl;

	@PostMapping("/addedUser")
	public String addUsersData(Users usr) {
		return usrsImpl.saveUsers(usr);
	}

	@GetMapping("/getUsers")
	public List<Users> getAllData() {
		return usrsImpl.getAllUsers();
	}
}
