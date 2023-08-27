package com.infy.fos.service;

import java.util.List;

import com.infy.fos.dto.VendorDTO;
import com.infy.fos.entity.Vendor;
import com.infy.fos.exception.FoodException;

import jakarta.validation.Valid;

public interface VendorService {
	List<VendorDTO> getAllVendors();
	//String addNewProduct(ProductDTO productDTO) throws FoodException;
	//Integer updateProduct(Integer productId) throws FoodException;
	

}
