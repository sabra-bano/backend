package com.infy.fos.dto;

import java.time.LocalDateTime;

import org.hibernate.validator.constraints.NotEmpty;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class VendorDTO {
	private Integer vendor_id;
	private String vendor_name;
	private String email_id;
	private String phone_number;
	private String image;
	private String description;

	public String getPhone_number() {
		return phone_number;
	}



	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}



	public String getEmail_id() {
		return email_id;
	}



	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}



	public String getVendor_name() {
		return vendor_name;
	}



	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}



	public Integer getVendor_id() {
		return vendor_id;
	}

	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

	
	@Override
	public String toString() {
		return "VendorDTO [vendor_id=" + vendor_id + ", vendor_name=" + vendor_name + ", email_id=" + email_id + ", phone_number="
				+ phone_number + ", image=" + image+ ", description=" + description+ "]";
	}



	


	

	

}
