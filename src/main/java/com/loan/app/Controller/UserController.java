package com.loan.app.Controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.loan.app.dao.UserRepository;
import com.loan.app.entities.AboutUs;
import com.loan.app.entities.ContactUs;
import com.loan.app.entities.User;
import com.loan.app.service.UserService;

@RestController
public class UserController {
		
	//autowired the UserService class  
	@Autowired  
	UserService userService; 
	
	@Autowired
	User user;
		//creating a get mapping that retrieves the detail of a specific book  
	@GetMapping("/user/{userid}")  
	private User getUsers(@PathVariable("userid") int userid)   
	{  
		return userService.getUsersById(userid);  
	}  
	//creating a delete mapping that deletes a specified book  
	@DeleteMapping("/user/{userid}")  
	private void deleteUser(@PathVariable("userid") int userid)   
	{  
	   userService.delete(userid);  
	}  
	//creating post mapping that post the book detail in the database  
	@PostMapping("/user")  
	private int saveUser(@RequestBody User user)   
	{  
	   userService.saveOrUpdate(user);  
	   return user.getId();  
	}  
	//creating put mapping that updates the book detail   
	@PutMapping("/user/{id}")  
	private User update(@RequestBody User user,@PathVariable("id") int id)   
	{  
    	userService.Update(user,id);  
    	return user;  
	}  
		
	@PutMapping("{email}/{password}")
	public String updatePassword(@PathVariable("email") String email,@PathVariable("password") String password) {
		String result=userService.setPasswordByEmail(email,password);
		return result;
	}
	
	@GetMapping("/AboutUs/")
	public AboutUs show() {
	   AboutUs aboutUs=new AboutUs();
	   return aboutUs;
	}
	
	@GetMapping("/ContactUs")
	public ContactUs display() {
		ContactUs contactUs=new ContactUs();
		return contactUs;
	}
		
}
	


