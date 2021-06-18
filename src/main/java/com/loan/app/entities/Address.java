package com.loan.app.entities;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Embeddable
public class Address {
	
	private String currentAddress;
	
	private String permenentAddress;
	
	private String city;
	
	private String state;
	
	private int postalCode;
	
	@NotBlank(message="How long have you lived in your given address!!")
	private String livedYears;
	
	
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

		
	

	/**
	 * @return the currentAddress
	 */
	public String getCurrentAddress() {
		return currentAddress;
	}
  

	/**
	 * @param currentAddress
	 * @param permenentAddress
	 * @param city
	 * @param state
	 * @param postalCode
	 * @param livedYears
	 */
	public Address(String currentAddress, String permenentAddress, String city, String state, int postalCode,
			@NotBlank(message = "How long have you lived in your given address!!") String livedYears) {
		super();
		this.currentAddress = currentAddress;
		this.permenentAddress = permenentAddress;
		this.city = city;
		this.state = state;
		this.postalCode = postalCode;
		this.livedYears = livedYears;
	}




	/**
	 * @param currentAddress the currentAddress to set
	 */
	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}


	/**
	 * @return the permenentAddress
	 */
	public String getPermenentAddress() {
		return permenentAddress;
	}


	/**
	 * @param permenentAddress the permenentAddress to set
	 */
	public void setPermenentAddress(String permenentAddress) {
		this.permenentAddress = permenentAddress;
	}


	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}


	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}


	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}


	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}


	/**
	 * @return the postalCode
	 */
	public int getPostalCode() {
		return postalCode;
	}


	/**
	 * @param postalCode the postalCode to set
	 */
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}


	/**
	 * @return the livedYears
	 */
	public String getLivedYears() {
		return livedYears;
	}


	/**
	 * @param livedYears the livedYears to set
	 */
	public void setLivedYears(String livedYears) {
		this.livedYears = livedYears;
	}


}
