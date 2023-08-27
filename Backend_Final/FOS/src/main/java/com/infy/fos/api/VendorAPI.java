package com.infy.fos.api;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.infy.fos.dto.VendorDTO;
import com.infy.fos.entity.Vendor;
import com.infy.fos.exception.FoodException;
import com.infy.fos.service.VendorService;

import jakarta.validation.Valid;

@RestController
@Validated
@RequestMapping(value="/vendor-api")
@CrossOrigin
public class VendorAPI {
	@Autowired
	private VendorService vendorService;
	
	@Autowired
	private Environment environment;
	
	
	
	//Log logger =LogFactory.getLog(ProductAPI.class)
	@GetMapping(value="/vendors")					//http://localhost:9090/food-api/vendors
	public ResponseEntity<List<VendorDTO>> getAllVendors() throws FoodException
	{
		List<VendorDTO> list = vendorService.getAllVendors();
		return new ResponseEntity<>(list,HttpStatus.OK);
	}
//	@PostMapping(value="/AddProducts")
//	public ResponseEntity<? > addProduct( @Valid @RequestBody ProductDTO productDto) throws FoodException{
//		
//		Integer addProduct=customerFoodService.addNewProduct(productDto);
//		String successMessage = environment.getProperty("API.ADD_SUCCESS")+ addProduct ;
//		return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
//
//		
//		//return new ResponseEntity<>(addProduct,HttpStatus.CREATED);
//	}
	/*@PutMapping(value="/Modify/{productId}")
	public ResponseEntity<Integer> modifyProduct(@PathVariable Integer productId) throws FoodException{
		customerFoodService.updateProduct(productId);
		
		return null;
	}*/
	/*{
   
    "name":"Pasta",
    "description":"Delicious Pasta",
    "price":40,
    "availableQuantity":1,
    "image":"../assets/foodimages/pasta.png"

}*/
}
