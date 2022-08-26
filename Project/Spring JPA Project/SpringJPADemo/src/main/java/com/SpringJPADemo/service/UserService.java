package com.SpringJPADemo.service;

import java.util.List;

import com.SpringJPADemo.entity.User;

// User Service interface
public interface UserService {
	
	//inserting user details in table
	User saveUser(User user);
	
	//fetching all user details from table
	List<User>getAllUser();
	
	//fetching user details from table
	User getUserById(int id);
	
	//modifying user details from table based on user id
	User updateUserById(User user, int id);
	
	//remove user details from table based on user id
	void deleteUserById(int id);
	
	//fetching user details from table using Name
	User userByName(String uName);
	
	//fetching user details from table using Phn number
		User userByPhn(long phnNumber);

}
