package javadatetimeexample.service;

import javadatetimeexample.dao.UserDetailsDAO;
import javadatetimeexample.dao.UserDetailsDAOImpl;
import javadatetimeexample.entity.UserDetails;

public class UserDetailsServiceImpl implements UserDetailsService {
	
	UserDetailsDAO userDetailsDAO = new UserDetailsDAOImpl();
	
	@Override
	public UserDetails retrieveUserDetails(Integer userId) {
		
		return userDetailsDAO.retrieveUserDetails(userId);
	}

	@Override
	public void saveUserDetails(UserDetails userDetails) {
		userDetailsDAO.saveUserDetails(userDetails);
	}

}
