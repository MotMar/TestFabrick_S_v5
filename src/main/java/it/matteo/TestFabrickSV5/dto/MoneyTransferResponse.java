package it.matteo.TestFabrickSV5.dto;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.time.LocalDate;
import java.util.List;

import it.matteo.TestFabrickSV5.object.AccountHolder;
import it.matteo.TestFabrickSV5.object.AmountInfo;
import it.matteo.TestFabrickSV5.object.Fee;

public class MoneyTransferResponse {

	private String moneyTransferId;
	private String status;
	private String direction;
	private AccountHolder creditor;
	private AccountHolderDTO debtor;
	private String cro;
	private String trn;
	private String uri;
	private String description;
	private Timestamp createdDatetime;
	private Timestamp accountedDatetime;
	private LocalDate debtorValueDate;
	private LocalDate creditorValueDate;
	private AmountInfo amount;
	private boolean isUrgent;
	private boolean isInstant;
	private String feeType;
	private String feeAccountId;
	private List<Fee> fees = new ArrayList<Fee>();
	private boolean hasTaxRelief;
	
	
	//	Constructors
	
	public MoneyTransferResponse(String moneyTransferId, String status, String direction, AccountHolder creditor,
			AccountHolderDTO debtor, String cro, String trn, String uri, String description, Timestamp createdDatetime,
			Timestamp accountedDatetime, LocalDate debtorValueDate, LocalDate creditorValueDate, AmountInfo amount,
			boolean isUrgent, boolean isInstant, String feeType, String feeAccountId, List<Fee> fees,
			boolean hasTaxRelief) {
		
		this.moneyTransferId = moneyTransferId;
		this.status = status;
		this.direction = direction;
		this.creditor = creditor;
		this.debtor = debtor;
		this.cro = cro;
		this.trn = trn;
		this.uri = uri;
		this.description = description;
		this.createdDatetime = createdDatetime;
		this.accountedDatetime = accountedDatetime;
		this.debtorValueDate = debtorValueDate;
		this.creditorValueDate = creditorValueDate;
		this.amount = amount;
		this.isUrgent = isUrgent;
		this.isInstant = isInstant;
		this.feeType = feeType;
		this.feeAccountId = feeAccountId;
		this.fees = fees;
		this.hasTaxRelief = hasTaxRelief;
	}
	
	public MoneyTransferResponse() {
	}

	
	//	Getters and Setters 
	
	public String getMoneyTransferId() {
		return this.moneyTransferId;
	}

	public String getStatus() {
		return this.status;
	}

	public String getDirection() {
		return this.direction;
	}

	public AccountHolder getCreditor() {
		return this.creditor;
	}

	public AccountHolderDTO getDebtor() {
		return this.debtor;
	}

	public String getCro() {
		return this.cro;
	}

	public String getTrn() {
		return this.trn;
	}

	public String getUri() {
		return this.uri;
	}

	public String getDescription() {
		return this.description;
	}

	public Timestamp getCreatedDatetime() {
		return this.createdDatetime;
	}

	public Timestamp getAccountedDatetime() {
		return this.accountedDatetime;
	}

	public LocalDate getDebtorValueDate() {
		return this.debtorValueDate;
	}

	public LocalDate getCreditorValueDate() {
		return this.creditorValueDate;
	}

	public AmountInfo getAmount() {
		return this.amount;
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

	public List<Fee> getFees() {	
		return this.fees;
	}

	public boolean isHasTaxRelief() {
		return this.hasTaxRelief;
	}

	public void setMoneyTransferId(String moneyTransferId) {
		this.moneyTransferId = moneyTransferId;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	public void setCreditor(AccountHolder creditor) {
		this.creditor = creditor;
	}

	public void setDebtor(AccountHolderDTO debtor) {
		this.debtor = debtor;
	}

	public void setCro(String cro) {
		this.cro = cro;
	}

	public void setTrn(String trn) {
		this.trn = trn;
	}

	public void setUri(String uri) {
		this.uri = uri;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCreatedDatetime(Timestamp createdDatetime) {
		this.createdDatetime = createdDatetime;
	}

	public void setAccountedDatetime(Timestamp accountedDatetime) {
		this.accountedDatetime = accountedDatetime;
	}

	public void setDebtorValueDate(LocalDate debtorValueDate) {
		this.debtorValueDate = debtorValueDate;
	}

	public void setCreditorValueDate(LocalDate creditorValueDate) {
		this.creditorValueDate = creditorValueDate;
	}

	public void setAmount(AmountInfo amount) {
		this.amount = amount;
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

	public void setFees(List<Fee> fees) {
		this.fees = fees;
	}

	public void setHasTaxRelief(boolean hasTaxRelief) {
		this.hasTaxRelief = hasTaxRelief;
	}
		
}
