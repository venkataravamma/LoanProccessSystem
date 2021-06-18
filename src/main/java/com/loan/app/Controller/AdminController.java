package com.loan.app.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.loan.app.entities.Admin;
import com.loan.app.entities.User;
import com.loan.app.service.AdminService;
import com.loan.app.service.UserService;

public class AdminController {
	//autowire the BooksService class  
	@Autowired  
	AdminService adminService; 
	
	@Autowired
	Admin admin;
	
	@Autowired
    User user;	
	//creating a get mapping that retrieves all the user detail from the database   
	@GetMapping("/admin/user")  
	private List<User> getAllUsers()   
	{  
		return adminService.getAllUsers();  
	}  
	
	//creating a get mapping that retrieves the detail of a specific user  
	@GetMapping("/admin/{userId}")  
	private User getUsers(@PathVariable("userId") int userId)   
	{  
		return adminService.getUserById(userId);  
	}  
	
	//creating a delete mapping that deletes a specified user 
	@DeleteMapping("/admin/{userId}")  
	private void deleteUser(@PathVariable("userId") int userId)   
	{  
		adminService.delete(userId);  
	}  
	
	//creating post mapping that post the admin detail in the database  
	@PostMapping("/admin")  
	private int saveAdmin(@RequestBody Admin admin)   
	{  
		adminService.saveOrUpdate(admin);  
		return admin.getId();  
	}  
	
	//creating put mapping that updates the admin detail   
	@PutMapping("/admin")  
	private Admin update(@RequestBody Admin admin)   
	{  
		adminService.Update(admin);  
		return admin;  
	}  

}
