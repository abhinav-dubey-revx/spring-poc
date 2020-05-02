package io.poc.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

//shared as information exchange object between various layers 
public class PocDto implements Serializable {

	private static final long serialVersionUID = -5078931362184711454L;
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