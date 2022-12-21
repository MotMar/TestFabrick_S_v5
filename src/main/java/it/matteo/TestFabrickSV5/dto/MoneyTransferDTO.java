package it.matteo.TestFabrickSV5.dto;


import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import it.matteo.TestFabrickSV5.object.AccountHolder;
import it.matteo.TestFabrickSV5.object.TaxRelief;

@JsonPropertyOrder({"creditor", "executionDate", "uri", "description", "amount", "currency", "isUrgent", "isInstant", "feeType", "feeAccountId", "taxRelief"})
public class MoneyTransferDTO {
	
	private AccountHolder creditor;
	private String executionDate;
	private String uri;
	private String description;
	private double amount;
	private String currency;
	@JsonAlias({"isUrgent"})
	private boolean isUrgent;
	@JsonAlias({"isInstant"})
	private boolean isInstant;
	private String feeType;
	private String feeAccountId;
	private TaxRelief taxRelief;
	
	
	//	Constructors
	
	public MoneyTransferDTO(AccountHolder creditor, String executionDate, String uri, String description, double amount,
			String currency, boolean isUrgent, boolean isInstant, String feeType, String feeAccountId,
			TaxRelief taxRelief) {
		this.creditor = creditor;
		this.executionDate = executionDate;
		this.uri = uri;
		this.description = description;
		this.amount = amount;
		this.currency = currency;
		this.isUrgent = isUrgent;
		this.isInstant = isInstant;
		this.feeType = feeType;
		this.feeAccountId = feeAccountId;
		this.taxRelief = taxRelief;
	}
	
	public MoneyTransferDTO() {
	}

	
	//	Getters and Setters
	
	public AccountHolder getCreditor() {
		return this.creditor;
	}

	public String getExecutionDate() {
		return this.executionDate;
	}

	public String getUri() {
		return this.uri;
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

	public boolean isUrgent() {
		return this.isUrgent;
	}

	public boolean isInstant() {
		return this.isInstant;
	}

	public String getFeeType() {
		return this.feeType;
	}

	public String getFeeAccountId() {
		return this.feeAccountId;
	}

	public TaxRelief getTaxRelief() {
		return this.taxRelief;
	}

	public void setCreditor(AccountHolder creditor) {
		this.creditor = creditor;
	}

	public void setExecutionDate(String executionDate) {
		this.executionDate = executionDate;
	}

	public void setUri(String uri) {
		this.uri = uri;
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

	public void setUrgent(boolean isUrgent) {
		this.isUrgent = isUrgent;
	}

	public void setInstant(boolean isInstant) {
		this.isInstant = isInstant;
	}

	public void setFeeType(String feeType) {
		this.feeType = feeType;
	}

	public void setFeeAccountId(String feeAccountId) {
		this.feeAccountId = feeAccountId;
	}

	public void setTaxRelief(TaxRelief taxRelief) {
		this.taxRelief = taxRelief;
	}
	
}
