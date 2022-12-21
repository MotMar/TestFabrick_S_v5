package it.matteo.TestFabrickSV5.dto;

import it.matteo.TestFabrickSV5.object.TransactionEnumerator;

public class AccountTransactionDTO {
	
	private String transactionId;
	private String operationId;
	private String accountingDate;
	private String valueDate;
	private TransactionEnumerator type;
	private double amount;
	private String currency;
	private String description;
	
	
	//	Constructors
	
	public AccountTransactionDTO(String transactionId, String operationId, String accountingDate, String valueDate,
			TransactionEnumerator type, double amount, String currency, String description) {
		this.transactionId = transactionId;
		this.operationId = operationId;
		this.accountingDate = accountingDate;
		this.valueDate = valueDate;
		this.type = type;
		this.amount = amount;
		this.currency = currency;
		this.description = description;
	}
	
	public AccountTransactionDTO() {
	}

	
	//	Getters and Setters
	
	public String getTransactionId() {
		return this.transactionId;
	}

	public String getOperationId() {
		return this.operationId;
	}

	public String getAccountingDate() {
		return this.accountingDate;
	}

	public String getValueDate() {
		return this.valueDate;
	}

	public TransactionEnumerator getType() {
		return this.type;
	}

	public double getAmount() {
		return this.amount;
	}

	public String getCurrency() {
		return this.currency;
	}

	public String getDescription() {
		return this.description;
	}

	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	public void setAccountingDate(String accountingDate) {
		this.accountingDate = accountingDate;
	}

	public void setValueDate(String valueDate) {
		this.valueDate = valueDate;
	}

	public void setType(TransactionEnumerator type) {
		this.type = type;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
