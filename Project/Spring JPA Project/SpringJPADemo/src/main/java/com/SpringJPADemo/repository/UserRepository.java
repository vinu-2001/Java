package com.SpringJPADemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.SpringJPADemo.entity.User;


// User repository using jparepository
public interface UserRepository extends JpaRepository<User, Integer>{

	
	//fetching user detail using username
	@Query("select u from User u where u.uName=?1")
	User userByName(String uName);
	
	//Fetching user details using phn no.
	@Query("select u from User u where u.phnNumber=?1")
	User userByPhn(long phnNumber);
	
}
