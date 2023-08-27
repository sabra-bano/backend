package com.infy.fos.validator;



import com.infy.fos.dto.UserDTO;
import com.infy.fos.exception.FoodException;

public class CategoryValidator {
	
	public CategoryValidator() {
		
	}
	
	public static void validateCategory(UserDTO userDTO) throws FoodException {
		if(!isValidCategory(userDTO.getCategory()))
		{
			throw new FoodException("CategoryValidator.INVALID_CATEGORY");
		}
	}

	public static Boolean isValidCategory(String category) {
		if(category.matches("(User|Vendor)"))
		{
		return true;
		}
		else
		{
			return false;
		}
		
	}

}
