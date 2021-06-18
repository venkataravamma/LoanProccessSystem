package com.loan.app.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Embeddable
public class Employee {	
	@Column(name="Present Employer")
	private String presentEmployer;
	
	@Column(name="Occupation")
	private String occupation;
	
	@Column(name="Years Of Experience")
	private int experience;
	
	@Column(name="MonthlyIncome")
	private long monthlyIncome;
	
	@Column(name="MonthlyRent")
	private long monthlyRent;
	
	@Column(name="Amount")
	private long amount;
	
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param presentEmployer
	 * @param occupation
	 * @param experience
	 * @param monthlyIncome
	 * @param monthlyRent
	 * @param amount
	 */
	public Employee(String presentEmployer, String occupation, int experience, long monthlyIncome, long monthlyRent,
			long amount) {
		super();
		this.presentEmployer = presentEmployer;
		this.occupation = occupation;
		this.experience = experience;
		this.monthlyIncome = monthlyIncome;
		this.monthlyRent = monthlyRent;
		this.amount = amount;
	}

	
	/**
	 * @return the presentEmployer
	 */
	public String getPresentEmployer() {
		return presentEmployer;
	}

	/**
	 * @param presentEmployer the presentEmployer to set
	 */
	public void setPresentEmployer(String presentEmployer) {
		this.presentEmployer = presentEmployer;
	}

	/**
	 * @return the occupation
	 */
	public String getOccupation() {
		return occupation;
	}

	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	/**
	 * @return the experience
	 */
	public int getExperience() {
		return experience;
	}

	/**
	 * @param experience the experience to set
	 */
	public void setExperience(int experience) {
		this.experience = experience;
	}

	/**
	 * @return the monthlyIncome
	 */
	public long getMonthlyIncome() {
		return monthlyIncome;
	}

	/**
	 * @param monthlyIncome the monthlyIncome to set
	 */
	public void setMonthlyIncome(long monthlyIncome) {
		this.monthlyIncome = monthlyIncome;
	}

	/**
	 * @return the monthlyRent
	 */
	public long getMonthlyRent() {
		return monthlyRent;
	}

	/**
	 * @param monthlyRent the monthlyRent to set
	 */
	public void setMonthlyRent(long monthlyRent) {
		this.monthlyRent = monthlyRent;
	}

	/**
	 * @return the amount
	 */
	public long getAmount() {
		return amount;
	}

	/**
	 * @param amoount the amunt to set
	 */
	public void setAmount(long amount) {
		this.amount = amount;
	}

	

}
