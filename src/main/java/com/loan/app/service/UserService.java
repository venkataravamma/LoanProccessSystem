package com.loan.app.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.loan.app.entities.User;

public interface UserService {

	public String setPasswordByEmail(String password,String email);
	public User getUsersById(int userid);
	public void delete(int userid);
	public void saveOrUpdate(User user);
	public  void Update(User user,int id);
	
}