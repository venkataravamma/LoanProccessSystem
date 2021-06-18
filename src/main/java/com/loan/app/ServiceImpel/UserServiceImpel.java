package com.loan.app.ServiceImpel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loan.app.dao.UserRepository;
import com.loan.app.entities.User;
import com.loan.app.service.UserService;

@Service
public class UserServiceImpel implements UserService{

	@Autowired
	private UserRepository userRepository;
	public String setPasswordByEmail(String email,String password) {
		String result=userRepository.setPasswordByEmail(password,email);
		return "Successfully Updated";
		
	}
	
	public User getUsersById(int userid) {
		return userRepository.findById(userid).get();
	}
	
	public void delete(int userid) {
		userRepository.deleteById(userid);
	}
	
	public void saveOrUpdate(User user) {
		userRepository.save(user);
	}
	
	public  void Update(User user,int id) {
		userRepository.save(user);
	}
	
	
	
}
