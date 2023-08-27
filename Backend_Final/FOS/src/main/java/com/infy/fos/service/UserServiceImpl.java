package com.infy.fos.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.infy.fos.dto.UserDTO;
import com.infy.fos.entity.User;
import com.infy.fos.exception.FoodException;
import com.infy.fos.repository.UserRepository;
import com.infy.fos.validator.CategoryValidator;


@Service(value = "userService")
@Transactional
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
    
	@Override
	public String addUser(UserDTO userdto) throws FoodException {
		
		//UserValidator.validateUser(userDTO);
		CategoryValidator.validateCategory(userdto);
		Optional<User> optional=userRepository.findByEmailId(userdto.getEmailId());
		Optional<User> op=userRepository.findByMobileNo(userdto.getMobileNo());

		if(optional.isPresent())
		{
			throw new FoodException("UserService.USER_ALREADY_EXISTS");
			
			
		}
		else if(op.isPresent())
		{
			throw new FoodException("UserService.USER_WITH_THIS_MOBILE_NO_ALREADY_PRESENT");
		}
		User userEntity = new User();
		
		userEntity.setEmailId(userdto.getEmailId());
		userEntity.setName(userdto.getName());
		userEntity.setPassword(userdto.getPassword());
		userEntity.setConfirmPassword(userdto.getConfirmPassword());
		userEntity.setMobileNo(userdto.getMobileNo());
		userEntity.setCategory(userdto.getCategory());
		User userEntity2 =userRepository.save(userEntity);
		return userEntity2.getEmailId();
		
	}
	
	
	

	@Override
	public User LogIn(String emailId, String password) throws FoodException {
		// TODO Auto-generated method stub
		Optional<User> optional=userRepository.findByEmailId(emailId);
		if(!optional.isPresent())
		{
			
				throw new FoodException("UserService.INVALID_EMAILID");
		}
		else
		{
			 User user=optional.get();
			if(user.getPassword().equals(password))
			{
				return user;
			}
		}
		return null;
	
	}
}
	
	


