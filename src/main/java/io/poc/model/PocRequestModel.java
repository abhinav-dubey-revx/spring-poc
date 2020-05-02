//package io.poc.model;
//
////incoming request format
//public class PocRequestModel {
//	
//	private String firstName ; 
//	private String lastName ;
//	private String email ; 
//	private String password ;
//	
//	//GETTER-SETTER
//	public String getFirstName() {
//		return firstName;
//	}
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	public String getLastName() {
//		return lastName;
//	}
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//	public String getEmail() {
//		return email;
//	}
//	public void setEmail(String email) {
//		this.email = email;
//	}
//	public String getPassword() {
//		return password;
//	}
//	public void setPassword(String password) {
//		this.password = password;
//	}
//	
//
//}



package io.poc.model;

import java.math.BigDecimal;
import java.math.BigInteger;

//incoming request format
public class PocRequestModel {
	
	private String name ; 
	private String email ; 
	private BigInteger pricingType;
	private BigDecimal pricingValue;
	private Long licenseeId;
	private boolean status;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public BigInteger getPricingType() {
		return pricingType;
	}
	public void setPricingType(BigInteger pricingType) {
		this.pricingType = pricingType;
	}
	public BigDecimal getPricingValue() {
		return pricingValue;
	}
	public void setPricingValue(BigDecimal pricingValue) {
		this.pricingValue = pricingValue;
	}
	public Long getLicenseeId() {
		return licenseeId;
	}
	public void setLicenseeId(Long licenseeId) {
		this.licenseeId = licenseeId;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	





	
	
}

