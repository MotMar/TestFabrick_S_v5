package it.matteo.TestFabrickSV5.object;

public class AccountInfo {

	private String accountCode;
	private String bicCode;
	
	
	//	Constructors
	
	public AccountInfo(String accountCode, String bicCode) {
		this.accountCode = accountCode;
		this.bicCode = bicCode;
	}

	public AccountInfo() {
	}
	
	//	Getters and Setters
	
	public String getAccountCode() {
		return this.accountCode;
	}

	public String getBicCode() {
		return this.bicCode;
	}
	
	public void setAccountCode(String accountCode) {
		this.accountCode = accountCode;
	}


	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}

}
