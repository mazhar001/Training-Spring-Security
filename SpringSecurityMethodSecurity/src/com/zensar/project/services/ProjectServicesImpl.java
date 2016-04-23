package com.zensar.project.services;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Set;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zensar.project.beans.User;
@Service("projectService")
@Transactional
public class ProjectServicesImpl  implements ProjectServices{
	private static Hashtable<Integer, User> usersDetails;
	static{
		usersDetails= new Hashtable<>();
		usersDetails.put(1, new User(1, "Satish", "Mahajan","user"));
		usersDetails.put(2, new User(2, "Rakesh", "Mahajan","admin"));
		usersDetails.put(3, new User(3, "Anil", "Mahajan","admin"));
		usersDetails.put(4, new User(4, "Bhavika", "Mahajan","user"));
		usersDetails.put(5, new User(5, "Rupali", "Mahajan","user"));
		usersDetails.put(6, new User(6, "Mayur", "Patil","user"));
		usersDetails.put(7, new User(7 ,"Ayush", "Patil","user"));
	}
	@Override
	public List<User> getUsersList() {
		ArrayList<User>userList=new ArrayList<>();
		Set<Integer>keys = usersDetails.keySet();
		for(Integer key:keys)
			userList.add(usersDetails.get(key));
		return userList;
	}
	@Override
	public User getUserDetails(int id) {
		return usersDetails.get(id);
	}
	@Override
	public void updateUser(User user) {
		usersDetails.put(user.getId(), user);	
	}
	@Override
	public void deleteUser(User user) {
		usersDetails.remove(user.getId());
	}
}