package javadatetimeexample.ui;

import java.util.Date;

import javadatetimeexample.entity.UserDetails;
import javadatetimeexample.service.UserDetailsService;
import javadatetimeexample.service.UserDetailsServiceImpl;

public class UserDetailsMainApp {

	public static void main(String[] args) {
		//userDetails is an instance variable referring to UserDetails class object
		/**
		 * Here UserDetails class object is created by invoking 
		 * UserDetails() constructor using new keyword
		 * 
		 */
		UserDetails userDetails = new UserDetails();
		System.out.println(userDetails);
		userDetails.setUserId(1);
		userDetails.setUserFirstName("Rosa");
		userDetails.setUserLastName("Gutierrez");
		userDetails.setEmail("rosa@gmail.com");
		userDetails.setMobile(9999100211l);
		userDetails.setDateOfBirth(new Date()); //using new keyword we have invoked Date class default constructor
		System.out.println(userDetails);
		UserDetails userDetailsOne = new UserDetails(2,"Bill","Gates",9999999911l,"bill@gmail.com",new Date(999911116822l));
		System.out.println(userDetailsOne);
		
		UserDetailsService userDetailsService = new UserDetailsServiceImpl();
		userDetailsService.saveUserDetails(userDetails);
		UserDetails retrievedUserDetails = userDetailsService.retrieveUserDetails(1);
		System.out.println(retrievedUserDetails);
	
	}

}
