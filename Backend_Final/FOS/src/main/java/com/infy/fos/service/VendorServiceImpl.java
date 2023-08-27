package com.infy.fos.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infy.fos.dto.VendorDTO;
import com.infy.fos.entity.Vendor;
import com.infy.fos.exception.FoodException;
import com.infy.fos.repository.VendorRepository;

import jakarta.transaction.Transactional;

@Service(value = "vendorService")
@Transactional
public class VendorServiceImpl implements VendorService {
	@Autowired
	private VendorRepository vendorRepository;

	
	public List<VendorDTO> getAllVendors(){
		Iterable<Vendor> vendors = vendorRepository.findAll();
		List<VendorDTO> vendorDTOs = new ArrayList<>();
		vendors.forEach(vendor -> {
			VendorDTO vendorDTO = new VendorDTO();
			vendorDTO.setVendor_name(vendor.getVendor_name());
			vendorDTO.setVendor_id(vendor.getVendor_id());
			vendorDTO.setPhone_number(vendor.getPhone_number());
			vendorDTO.setEmail_id(vendor.getEmail_id());
			vendorDTO.setImage(vendor.getImage());
			vendorDTO.setDescription(vendor.getDescription());
			
			
			vendorDTOs.add(vendorDTO);
		});
		return vendorDTOs;
	}


	
//	public Integer addNew(ProductDTO productDTO) throws FoodException {
//		// TODO Auto-generated method stub
//		//Optional<Product> optional=productRepository.findByProductId(productDTO.getProductId());
//		//if(optional.isPresent())
//		//{
//			//throw new FoodException("ProductService.PRODUCT_ALREADY_EXISTS");
//			
//			
//		
//		
//		Product addnewproduct = new Product();
//		
//		Product product= new Product();
//		product.setProductId(productDTO.getProductId());
//		product.setName(productDTO.getName());
//		product.setDescription(productDTO.getDescription());
//		product.setPrice(productDTO.getPrice());
//		product.setAvailableQuantity(productDTO.getAvailableQuantity());
//		product.setImage(productDTO.getImage());
//		product.setEstimatedTime(productDTO.getEstimatedTime());
//		product.setVendor_id(productDTO.getVendor_id());
//		Product product1=productRepository.save(product);
//		
//		
//		return product1.getProductId();
//		
		/*
		Product product= new Product();
		product.setProductId(productDTO.getProductId());
		product.setName(productDTO.getName());
		product.setDescription(productDTO.getDescription());
		product.setPrice(productDTO.getPrice());
		product.setAvailableQuantity(productDTO.getQuantity());
		Product product1=productRepository.save(product);
		
		
		
		return product1;
	}*/
		

}



	/*
	public Integer updateProduct(Integer productId) throws FoodException {
		// TODO Auto-generated method stub
		return null;*/
	

