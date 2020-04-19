package io.poc;

public enum ErrorMessages {
	
	MISING_REQUIRED_FEILD("Missing required feild . Please check doucumentation for required feilds."),
	NO_RECORD_FOUND("Record with provided id is not found."),
	INTERNAL_SERVER_ERROR("Internal server error.");

	private String errMsg;
	
	ErrorMessages(String errMsg){
		this.errMsg = errMsg;
	}
	
	
	public String getErrorMessage() {
		return errMsg;
	}
	
	public void setErrorMessage(String errMsg) {
		this.errMsg = errMsg;
	}

}
