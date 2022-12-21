package it.matteo.TestFabrickSV5.dto;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

public class AccountTransactionPayload {
	
	@JsonDeserialize(as = ArrayList.class, contentAs = AccountTransactionDTO.class)
	private List<AccountTransactionDTO> list;
	
	//	Constructors
	
	public AccountTransactionPayload(List<AccountTransactionDTO> list) {
		this.list = list;
	}
	
	public AccountTransactionPayload() {
	}

	
	//	Getters and Setters
	
	public List<AccountTransactionDTO> getList() {
		return this.list;
	}

	public void setList(List<AccountTransactionDTO> list) {
		this.list = list;
	}

}
