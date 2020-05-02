package io.poc.model;

import java.math.BigDecimal;
import java.math.BigInteger;

//after advertiser is save the response is sent in this format(password is not returned)
//public class PocResponseEntity {
//	
//	private long userId ; //public user id , returned with response , BUT not the DB primary-key
//	private String firstName;
//	private String lastName ;
//	private String email ; 
//
//	//GETTER-SETTER
//	public long getUserId() {
//		return userId;
//	}
//
//	public void setUserId(long userId) {
//		this.userId = userId;
//	}
//
//	public String getFirstName() {
//		return firstName;
//	}
//
//	public void setFirstName(String firstNAme) {
//		this.firstName = firstNAme;
//	}
//
//	public String getLastName() {
//		return lastName;
//	}
//
//	public void setLastName(String lastName) {
//		this.lastName = lastName;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//
//}


public class PocResponseEntity {
	
	private long id ; 
	private String name ; 
	private String email ; 
	private BigInteger pricingType;
	private BigDecimal pricingValue;
	private Long licenseeId;
	private boolean status;
	
	
	
	//GETTER-SETTER
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
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
