package it.matteo.TestFabrickSV5.dto;

public class GenericResponse {
	
	private String status;
	private Object[] errors;
	private Object payload;
	
	
	//	Constructors
	
	public GenericResponse(String status, Object[] errors, Object payload) {
		this.status = status;
		this.errors = errors;
		this.payload = payload;
	}
	
	public GenericResponse() {
	}

	
	//	Getters and Setters
	
	public String getStatus() {
		return this.status;
	}

	public Object[] getErrors() {
		return this.errors;
	}

	public Object getPayload() {
		return this.payload;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setErrors(Object[] errors) {
		this.errors = errors;
	}

	public void setPayload(Object payload) {
		this.payload = payload;
	}
	
}
