package com.infy.fos.service;

import com.infy.fos.dto.UserDTO;
import com.infy.fos.entity.User;
import com.infy.fos.exception.FoodException;


public interface UserService  {
	public String addUser(UserDTO userdto) throws FoodException;
	//
	//public String LogIn(LoginDTO login) throws FoodException;
	public User LogIn(String emailId,String password) throws FoodException;

	

}
