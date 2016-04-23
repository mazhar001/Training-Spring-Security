package com.zensar.project.services;
import java.util.List;
import org.springframework.security.access.prepost.PreAuthorize;
import com.zensar.project.beans.User;
public interface ProjectServices {
	List<User> getUsersList();
	User getUserDetails(int id);
	//@Secured("ROLE_ADMIN")
	@PreAuthorize("hasRole('ADMIN')")
	void updateUser(User user);
	//@Secured({"ROLE_ADMIN","ROLE_DBA"})
	@PreAuthorize("hasRole('ADMIN') AND hasRole('DBA')")
	void deleteUser(User user);
}
