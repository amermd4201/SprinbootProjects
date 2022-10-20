package com.eurekaserverproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eurekaserverproject.entity.Users;
import com.eurekaserverproject.repo.UserRepo;
@Service
public class UsersServiceImpl implements UsersService {

	@Autowired
	public UserRepo userRepo;

	@Override
	public String saveUsers(Users usr) {
       
		Users users =  userRepo.save(usr);
		
		if(users!=null) {
			return "Data is added";		
		}else {
			return "Sorry buddy Data is Not Added";
		}
	 
	}

	@Override
	public List<Users> getAllUsers() {

		return userRepo.findAll();
	}

}
