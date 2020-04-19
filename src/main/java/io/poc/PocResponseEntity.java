package io.poc;

//after advertiser is save the response is sent in this format(password is not returned)
public class PocResponseEntity {
	
	private long userId ; //public user id , returned with response , BUT not the DB primary-key
	private String firstName;
	private String lastName ;
	private String email ; 

	//GETTER-SETTER
	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstNAme) {
		this.firstName = firstNAme;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}


}
