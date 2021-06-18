
package com.loan.app.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name="Login_Data")
public class LoginData implements Serializable{
	
	@NotBlank(message="User name con't be empty!!")
	private String userName;
	
	@Email(regexp="^[a-zA-Z0-9+_.-]+@[a-zA-z0-9.-]+$")
	@Column(unique=true)
	private String email;
	
	@Size(min=6,max=10,message="min 6 and max 10 numbers  are allowed!!")
	private int pin;
	
	private  transient String password;
	

	public LoginData() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LoginData(@NotBlank(message = "User name con't be empty!!") String userName,
			@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-z0-9.-]+$") String email, String password) {
		super();
		this.userName = userName;
		this.email = email;
		this.password = password;
	}
	

	public LoginData(@NotBlank(message = "User name con't be empty!!") String userName,
			@Email(regexp = "^[a-zA-Z0-9+_.-]+@[a-zA-z0-9.-]+$") String email,String password, int pin) {
		super();
		this.userName = userName;
		this.email = email;
		this.pin = pin;
		this.password = password;
	}

	/**
	 * @return the pin
	 */
	public int getPin() {
		return pin;
	}

	/**
	 * @param pin the pin to set
	 */
	public void setPin(int pin) {
		this.pin = pin;
	}

	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "LoginData [userName=" + userName + ", email=" + email + "]";
	}

}
