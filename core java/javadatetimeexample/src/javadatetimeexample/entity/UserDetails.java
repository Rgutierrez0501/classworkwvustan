package javadatetimeexample.entity;

import java.util.Date;

public class UserDetails {
	/*
	 * Fields or Properties of UserDetails class
	 */
	// private is an access modifiers and Integer is wrapper class to primitive data type int
	private Integer userId; 
	private String userFirstName;
	private String userLastName;
	private Long mobile;//primitive type long
	private String email;
	private Date dateOfBirth;
	
	//Default Constructor
	public UserDetails() {
		
	}
	//Parameterized Constructor
	public UserDetails(Integer userId, String userFirstName, String userLastName, Long mobile, String email,
			Date dateOfBirth) {

		this.userId = userId;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.mobile = mobile;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
	}
	
	/**
	 * 
	 * Getter and Setters Method
	 */
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserFirstName() {
		return userFirstName;
	}
	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}
	public String getUserLastName() {
		return userLastName;
	}
	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", userFirstName=" + userFirstName + ", userLastName=" + userLastName
				+ ", mobile=" + mobile + ", email=" + email + ", dateOfBirth=" + dateOfBirth + "]";
	}
	
	
	

}
