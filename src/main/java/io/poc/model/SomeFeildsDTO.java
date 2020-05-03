package io.poc.model;

public class SomeFeildsDTO {


	private long s_id; // public user id , returned with response , BUT not the DB primary-key
	private String s_name;
	private String s_email;
	
	
	public long getS_id() {
		return s_id;
	}
	public void setS_id(long s_id) {
		this.s_id = s_id;
	}
	public String getS_name() {
		return s_name;
	}
	public void setS_name(String s_name) {
		this.s_name = s_name;
	}
	public String getS_email() {
		return s_email;
	}
	public void setS_email(String s_email) {
		this.s_email = s_email;
	}
	
	public SomeFeildsDTO(long s_id, String s_name, String s_email) {
		this.s_id = s_id;
		this.s_name = s_name;
		this.s_email = s_email;
	}
	
	public SomeFeildsDTO() {
	}

	
	
	
	

	
}
