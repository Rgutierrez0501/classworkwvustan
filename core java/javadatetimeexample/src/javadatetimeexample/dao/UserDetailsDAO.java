package javadatetimeexample.dao;

import javadatetimeexample.entity.UserDetails;

public interface UserDetailsDAO {
		public UserDetails retrieveUserDetails(Integer userId);
		public void saveUserDetails(UserDetails userDetails);

}
