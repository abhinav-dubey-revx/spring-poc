package io.poc.entity;
import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "advertiser_3")
public class PocEntity_2 implements Serializable{
	
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
	private String licenseeId;
	
	@Column(name = "av_active" , nullable = false)
	private boolean status;


}
