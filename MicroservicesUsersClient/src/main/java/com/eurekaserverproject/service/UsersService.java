package com.eurekaserverproject.service;

import java.util.List;

import com.eurekaserverproject.entity.Users;

public interface UsersService {

	public String saveUsers(Users usr);

	public List<Users> getAllUsers();

}
