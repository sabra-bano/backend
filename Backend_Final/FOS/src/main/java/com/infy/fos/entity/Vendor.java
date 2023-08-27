package com.infy.fos.entity;

import java.time.LocalDateTime;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="EK_VENDOR")
public class Vendor {
	@Id
	@Column(name="VENDOR_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer vendor_id;
	@Column(name="VENDOR_NAME")
	private String vendor_name;
	@Column(name="EMAIL_ID")
	private String email_id;
	@Column(name="PHONE_NUMBER")
	private String phone_number;
	@Column(name="Image")
	private String image;
	@Column(name="Description")
	private String description;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Integer getVendor_id() {
		return vendor_id;
	}
	public void setVendor_id(Integer vendor_id) {
		this.vendor_id = vendor_id;
	}
	public String getVendor_name() {
		return vendor_name;
	}
	public void setVendor_name(String vendor_name) {
		this.vendor_name = vendor_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public int hashCode() {
		return Objects.hash(vendor_id, vendor_name, email_id, phone_number,image,description);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vendor other = (Vendor) obj;
		return Objects.equals(vendor_id, other.vendor_id)
				&& Objects.equals(vendor_name, other.vendor_name)
				&& Objects.equals(email_id, other.email_id)
				&& Objects.equals(phone_number, other.phone_number)
				&& Objects.equals(image, other.image)
				&& Objects.equals(description, other.description);
	}
	/*@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", availableQuantity=" + availableQuantity + "]";
	}*/

	@Override
	public String toString() {
		return "Vendor [vendor_id=" + vendor_id + ", vendor_name=" + vendor_name + ", email_id=" + email_id + ", phone_number="
				+ phone_number + ", image=" + image + ", description=" + description +"]";
	}
	
	
	

}
