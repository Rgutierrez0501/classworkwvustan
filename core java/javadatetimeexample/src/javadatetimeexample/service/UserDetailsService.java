package javadatetimeexample.service;

import javadatetimeexample.entity.UserDetails;

public interface UserDetailsService {
		public UserDetails retrieveUserDetails(Integer userId);
		public void saveUserDetails(UserDetails userDetails);

}
