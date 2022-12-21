package it.matteo.TestFabrickSV5.object;

public class AddressInfo {

	private String address;
	private String city;
	private String countryCode;
	
	//	Constructors
	
	public AddressInfo(String address, String city, String countryCode) {
		this.address = address;
		this.city = city;
		this.countryCode = countryCode;
	}
	
	public AddressInfo() {
	}


	//	Getters and Setters

	public String getAddress() {
		return this.address;
	}

	public String getCity() {
		return this.city;
	}

	public String getCountryCode() {
		return this.countryCode;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}	
	
}
