package io.poc.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

//@Entity
//@Table(name = "advertiser_2")
//public class PocEntity implements Serializable {
//
//	private static final long serialVersionUID = -6936553881785829687L;
//	@Id
//	@GeneratedValue
//	private long id; // database key , auto-incremented
//
//	@Column(nullable = false)
//	private long userId; // public user id , returned with response , BUT not the DB primary-key
//
//	@Column(nullable = false)
//	private String firstName;
//
//	@Column(nullable = false)
//	private String lastName;
//
//	@Column(nullable = false)
//	private String email;
//
//	@Column(nullable = false)
//	private String password;
//
//	@Column(nullable = false)
//	private String encryptedPassword;
//
//	private String emailVerificationToken;
//
//	@Column(nullable = false)
//	private boolean emailVerificationStatus = false;
//
//	public long getId() {
//		return id;
//	}
//
//	public void setId(long id) {
//		this.id = id;
//	}
//
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
//	public void setFirstName(String firstName) {
//		this.firstName = firstName;
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
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public String getEncryptedPassword() {
//		return encryptedPassword;
//	}
//
//	public void setEncryptedPassword(String encryptedPassword) {
//		this.encryptedPassword = encryptedPassword;
//	}
//
//	public String getEmailVerificationToken() {
//		return emailVerificationToken;
//	}
//
//	public void setEmailVerificationToken(String emailVerificationToken) {
//		this.emailVerificationToken = emailVerificationToken;
//	}
//
//	public boolean getEmailVerificationStatus() {
//		return emailVerificationStatus;
//	}
//
//	public void setEmailVerificationStatus(boolean emailVerificationStatus) {
//		this.emailVerificationStatus = emailVerificationStatus;
//	}
//
//}
//



@Entity
@Table(name = "advertiser_3")
public class PocEntity implements Serializable{
	
	private static final long serialVersionUID = -6936553881785829687L;
	
	@Id
	@GeneratedValue
	@Column(name="av_id")
	private long id;

	@Column(name = "av_name" , nullable = false)
	private String name;

	@Column(name = "av_email" , nullable = false)
	private String email;
	
	@Column(name = "av_pricing_id" , nullable = false)
	private BigInteger pricingType;
	
	@Column(name = "av_flowrate" , nullable = false)
	private BigDecimal pricingValue;
	
	@Column(name = "av_ln_id" , nullable = false)
	private Long licenseeId;
	
	@Column(name = "av_active" , nullable = false , columnDefinition = "boolean default false")
	private boolean status;

	
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
