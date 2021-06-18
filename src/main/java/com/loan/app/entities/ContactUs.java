package com.loan.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class ContactUs {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private static int id;
	
	private static String address;
	
	private static int phoneNumber;
	
	private static String Email;

	
	/**
	 * @return the id
	 */
	public static int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public static void setId(int id) {
		ContactUs.id = id;
	}

	/**
	 * @return the address
	 */
	public static String getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public static void setAddress(String address) {
		ContactUs.address = address;
	}

	/**
	 * @return the phoneNumber
	 */
	public static int getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public static void setPhoneNumber(int phoneNumber) {
		ContactUs.phoneNumber = phoneNumber;
	}

	/**
	 * @return the email
	 */
	public static String getEmail() {
		return Email;
	}

	/**
	 * @param email the email to set
	 */
	public static void setEmail(String email) {
		Email = email;
	}

	public ContactUs() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ContactUs []";
	}

	
	
	
}
