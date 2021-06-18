package com.loan.app.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.loan.app.entities.Admin;
import com.loan.app.entities.User;

@Service
public interface AdminService {
	public List<User> getAllUsers();
	public User getUserById(int userId) ;
	public void delete(int userId);
	public void saveOrUpdate(Admin admin) ; 
	public void Update( Admin admin);
	
}
