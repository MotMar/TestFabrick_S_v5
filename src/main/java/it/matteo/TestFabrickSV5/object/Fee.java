package it.matteo.TestFabrickSV5.object;

public class Fee {
	
	private String feeCode;
	private String description;
	private double amount;
	private String currency;
	
	
	//	Constructors
	
	public Fee(String feeCode, String description, double amount, String currency) {
		this.feeCode = feeCode;
		this.description = description;
		this.amount = amount;
		this.currency = currency;
	}
	
	public Fee() {
	}

	
	//	Getters and Setters
	
	public String getFeeCode() {
		return this.feeCode;
	}

	public String getDescription() {
		return this.description;
	}

	public double getAmount() {
		return this.amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public void setFeeCode(String feeCode) {
		this.feeCode = feeCode;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
}
