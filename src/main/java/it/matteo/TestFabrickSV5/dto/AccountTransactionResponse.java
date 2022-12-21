package it.matteo.TestFabrickSV5.dto;

public class AccountTransactionResponse {
	
	private String status;
	private Object[] errors;
	private AccountTransactionPayload payload;
	
	
	//	Constructors
	
	public AccountTransactionResponse(String status, Object[] errors, AccountTransactionPayload payload) {
		this.status = status;
		this.errors = errors;
		this.payload = payload;
	}
	
	public AccountTransactionResponse() {
	}

	
	//	Getters and Setters
	
	public String getStatus() {
		return this.status;
	}

	public Object[] getErrors() {
		return this.errors;
	}

	public AccountTransactionPayload getPayload() {
		return this.payload;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setErrors(Object[] errors) {
		this.errors = errors;
	}

	public void setPayload(AccountTransactionPayload payload) {
		this.payload = payload;
	}
	
}
