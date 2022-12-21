package it.matteo.TestFabrickSV5.object;

public class AccountHolder {

	private String name;
	private AccountInfo account;
	private AddressInfo address;
	
	//	Constructors
	
	public AccountHolder(String name, AccountInfo account, AddressInfo address) {
		this.name = name;
		this.account = account;
		this.address = address;
	}
	
	public AccountHolder() {
	}

	
	//	Getters and Setters
	
	public String getName() {
		return this.name;
	}

	public AccountInfo getAccount() {
		return this.account;
	}

	public AddressInfo getAddress() {
		return this.address;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public void setAccount(AccountInfo account) {
		this.account = account;
	}

	public void setAddress(AddressInfo address) {
		this.address = address;
	}
}
