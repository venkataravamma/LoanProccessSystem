package com.loan.app.entities;



import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;


@Entity
@Table(name="User")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private int id;

	@NotBlank(message="Name field is required!!")
	
	private String title;
	
	@Size(min=2,max=20,message="min 2 and max 20 characters are allowed!!")
    private String fullName;
	
	@Column(unique=true)
    private String email;
	
    private Date birthDate;
    
    private boolean enabled;
    
    private String martialStatus;
    
    private int mobileNumber;
    
    private int landLineNumber;

    private Address address;
    
    private Employee  employee;
   
    @Transient
	private String password;

    
    
    public User() {
		super();
		// TODO Auto-generated constructor stub
	}
    

		/**
	 * @param id
	 * @param title
	 * @param fullName
	 * @param email
	 * @param password
	 * @param birthDate
	 * @param enabled
	 * @param martialStatus
	 * @param mobileNumber
	 * @param landLineNumber
	 * @param address
	 * @param employee
	 */
	public User(int id, String title, String fullName, String email, String password, Date birthDate, boolean enabled,
			String martialStatus, int mobileNumber, int landLineNumber, Address address, Employee employee) {
		super();
		this.id = id;
		this.title = title;
		this.fullName = fullName;
		this.email = email;
		this.password=password;
		this.birthDate = birthDate;
		this.enabled = enabled;
		this.martialStatus = martialStatus;
		this.mobileNumber = mobileNumber;
		this.landLineNumber = landLineNumber;
		this.address = address;
		this.employee = employee;
	}

	
	/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}


		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}


		/**
		 * @return the title
		 */
		public String getTitle() {
			return title;
		}


		/**
		 * @param title the title to set
		 */
		public void setTitle(String title) {
			this.title = title;
		}


		/**
		 * @return the fullName
		 */
		public String getFullName() {
			return fullName;
		}


		/**
		 * @param fullName the fullName to set
		 */
		public void setFullName(String fullName) {
			this.fullName = fullName;
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


		/**
		 * @return the birthDate
		 */
		public Date getBirthDate() {
			return birthDate;
		}


		/**
		 * @param birthDate the birthDate to set
		 */
		public void setBirthDate(Date birthDate) {
			this.birthDate = birthDate;
		}


		/**
		 * @return the enabled
		 */
		public boolean isEnabled() {
			return enabled;
		}


		/**
		 * @param enabled the enabled to set
		 */
		public void setEnabled(boolean enabled) {
			this.enabled = enabled;
		}


		/**
		 * @return the martialStatus
		 */
		public String getMartialStatus() {
			return martialStatus;
		}


		/**
		 * @param martialStatus the martialStatus to set
		 */
		public void setMartialStatus(String martialStatus) {
			this.martialStatus = martialStatus;
		}


		/**
		 * @return the mobileNumber
		 */
		public int getMobileNumber() {
			return mobileNumber;
		}


		/**
		 * @param mobileNumber the mobileNumber to set
		 */
		public void setMobileNumber(int mobileNumber) {
			this.mobileNumber = mobileNumber;
		}


		/**
		 * @return the landLineNumber
		 */
		public int getLandLineNumber() {
			return landLineNumber;
		}


		/**
		 * @param landLineNumber the landLineNumber to set
		 */
		public void setLandLineNumber(int landLineNumber) {
			this.landLineNumber = landLineNumber;
		}


		/**
		 * @return the address
		 */
		public Address getAddress() {
			return address;
		}


		/**
		 * @param address the address to set
		 */
		public void setAddress(Address address) {
			this.address = address;
		}


		/**
		 * @return the employee
		 */
		public Employee getEmployee() {
			return employee;
		}


		/**
		 * @param employee the employee to set
		 */
		public void setEmployee(Employee employee) {
			this.employee = employee;
		}


		@Override
		public String toString() {
			return "User [id=" + id + ", title=" + title + ", fullName=" + fullName + ", email=" + email + ", password="
					+ password + ", birthDate=" + birthDate + ", enabled=" + enabled + ", martialStatus="
					+ martialStatus + ", mobileNumber=" + mobileNumber + ", landLineNumber=" + landLineNumber
					+ ", address=" + address + "]";
		}


	
    

}
