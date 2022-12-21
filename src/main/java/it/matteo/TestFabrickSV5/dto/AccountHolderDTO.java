package it.matteo.TestFabrickSV5.dto;

import it.matteo.TestFabrickSV5.object.AccountInfo;

public class AccountHolderDTO {
	
	private String name;
	private AccountInfo account;

	
	//	Constructors
	
	public AccountHolderDTO(String name, AccountInfo account) {
		this.name = name;
		this.account = account;
	}
	
	public AccountHolderDTO() {
	}
	
	
	//	Getters and Setters
	
	public String getName() {
		return this.name;
	}

	public AccountInfo getAccount() {
		return this.account;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAccount(AccountInfo account) {
		this.account = account;
	}
	
}
