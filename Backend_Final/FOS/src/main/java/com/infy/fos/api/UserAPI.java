package com.infy.fos.api;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.infy.fos.dto.UserDTO;
import com.infy.fos.entity.User;
import com.infy.fos.exception.FoodException;
import com.infy.fos.service.UserService;


import jakarta.validation.Valid;

@RestController
@RequestMapping(value = "/users")
@Validated
@CrossOrigin
public class UserAPI {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private Environment environment;
	
	@PostMapping(value = "/register")
	public ResponseEntity<String> addUser( @Valid @RequestBody UserDTO userdto) throws FoodException {
		if(!userdto.getPassword().equals(userdto.getConfirmPassword()))
				{
			     return ResponseEntity.badRequest().body("password and confirmPassword are not matching,please reEnter your password");
			  
				}
		String emailId = userService.addUser(userdto);
		String successMessage = environment.getProperty("API.INSERT_SUCCESS") + emailId;
		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);

}
	@PostMapping (value = "/login")
	public ResponseEntity<String> login(@RequestBody Map<String, String> credentials) throws FoodException{
		String emailId=credentials.get("emailId");
		String password=credentials.get("password");
		
		User user=userService.LogIn(emailId,password);
		if(user !=null)
		{
			String successMessage = environment.getProperty("API.LOGIN_SUCCESS") +emailId;
			return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
		}
		else
		{
			return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Incorrect password,please enter correct password");
	
	
	
		}
	}
	
}

/*

http://localhost:8770/users/register
{
     "mobileNo": "09471239314",
      "confirmPassword":"sona@123",
       "emailId":"monaai@123gmail.com",
        "name":"Sonali Singh",
         "password": "sona@123" ,
         "category":"User"

}

*/
