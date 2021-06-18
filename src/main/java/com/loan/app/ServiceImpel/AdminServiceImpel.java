package com.loan.app.ServiceImpel;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.loan.app.dao.AdminRepository;
import com.loan.app.dao.UserRepository;
import com.loan.app.entities.Admin;
import com.loan.app.entities.User;
import com.loan.app.service.AdminService;

public class AdminServiceImpel implements AdminService{
   @Autowired
   UserRepository userRepository;
   
   @Autowired 
   AdminRepository adminRepository;
      
	public List<User> getAllUsers(){
		List<User> users=new ArrayList<User>();
		userRepository.findAll().forEach(user1->
		users.add(user1));
		return users;
		
	}
	
	public User getUserById(int userId) {
		
		return userRepository.findById(userId).get();
		
	}
	
	public void delete(int userId) {
		
		userRepository.deleteById(userId);
	}
	
	public void saveOrUpdate(Admin admin) {
		
		adminRepository.save(admin);
		
	} 
	
	public void Update( Admin admin) {
		
		adminRepository.save(admin);

		
	}
	


}
