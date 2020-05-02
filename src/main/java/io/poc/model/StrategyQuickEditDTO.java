package io.poc.model;

public class StrategyQuickEditDTO {


	private Long id; // public user id , returned with response , BUT not the DB primary-key
	private String fName;
	private String lName;
	private String email;

	public StrategyQuickEditDTO() {
	}

	public StrategyQuickEditDTO(Long id, String firstName, String lastName, String email) {
//		super();
		this.id = id;
		this.fName = firstName;
		this.lName = lastName;
		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return fName;
	}

	public void setFirstName(String firstName) {
		this.fName = firstName;
	}

	public String getLastName() {
		return lName;
	}

	public void setLastName(String lastName) {
		this.lName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}





}
