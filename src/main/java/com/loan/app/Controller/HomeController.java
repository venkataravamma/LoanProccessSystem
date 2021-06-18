package com.loan.app.Controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.loan.app.dao.LoginRepository;
import com.loan.app.dao.UserRepository;
import com.loan.app.entities.LoginData;
import com.loan.app.entities.User;

@Controller
public class HomeController {
	
	@Autowired
	private LoginRepository loginRepository;
	@RequestMapping("/")
	@ResponseBody
	public String home() {
		
		return "Welcome to The World Bank";
	}
	@RequestMapping(value="/SignUp" ,method=RequestMethod.POST)
	
	public String signup() {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
	try {
		  System.out.println("Enter User Name");
		  String userName=br.readLine();
		  System.out.println("Enter email");
		  String email=br.readLine();
		  System.out.println("Enter password");
		  String password=br.readLine();
		  System.out.println("Enter your role user/admin");
		  String role=br.readLine();
		if(role!="user") {
			System.out.println("Enter Security Pin");
			int pin=(Integer)br.read();
			/*if(pin==code)
			{
				LoginData loginData=new LoginData(userName,email,password,pin);
				loginRepository.save(loginData);
			}*/
		
		  }
		else {
			List<User> list=new ArrayList<User>();
			LoginData loginData=new LoginData(userName,email,password);
			  
			list.stream().forEach(user->{
				if(user.getFullName().equalsIgnoreCase(loginData.getUserName()) || user.getEmail().equalsIgnoreCase(loginData.getEmail())) {
					System.out.println("You are allredy registerd go to User page");
				}
				else {
					loginRepository.save(loginData);
				}
			});
		
		}
	     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	return null;
        
	}
	

}
