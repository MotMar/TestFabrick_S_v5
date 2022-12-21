package it.matteo.TestFabrickSV5.object;

import java.time.LocalDate;

public class AmountInfo {

	private double debtorAmount;
	private String debtorCurrency;
	private double creditorAmount;
	private String creditorCurrency;
	private LocalDate creditorCurrencyDate;
	private double exchangeRate;
	
	
	// Constructors
	
	public AmountInfo(double debtorAmount, String debtorCurrency, double creditorAmount, String creditorCurrency,
			LocalDate creditorCurrencyDate, double exchangeRate) {
		this.debtorAmount = debtorAmount;
		this.debtorCurrency = debtorCurrency;
		this.creditorAmount = creditorAmount;
		this.creditorCurrency = creditorCurrency;
		this.creditorCurrencyDate = creditorCurrencyDate;
		this.exchangeRate = exchangeRate;
	}
	
	public AmountInfo() {
	}

	
	//	Getters and Setters
	
	public double getDebtorAmount() {
		return this.debtorAmount;
	}

	public String getDebtorCurrency() {
		return this.debtorCurrency;
	}

	public double getCreditorAmount() {
		return this.creditorAmount;
	}

	public String getCreditorCurrency() {
		return this.creditorCurrency;
	}

	public LocalDate getCreditorCurrencyDate() {
		return this.creditorCurrencyDate;
	}

	public double getExchangeRate() {
		return this.exchangeRate;
	}

	public void setDebtorAmount(double debtorAmount) {
		this.debtorAmount = debtorAmount;
	}

	public void setDebtorCurrency(String debtorCurrency) {
		this.debtorCurrency = debtorCurrency;
	}

	public void setCreditorAmount(double creditorAmount) {
		this.creditorAmount = creditorAmount;
	}

	public void setCreditorCurrency(String creditorCurrency) {
		this.creditorCurrency = creditorCurrency;
	}

	public void setCreditorCurrencyDate(LocalDate creditorCurrencyDate) {
		this.creditorCurrencyDate = creditorCurrencyDate;
	}

	public void setExchangeRate(double exchangeRate) {
		this.exchangeRate = exchangeRate;
	}
	
}
