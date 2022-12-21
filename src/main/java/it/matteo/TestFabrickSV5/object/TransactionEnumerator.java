package it.matteo.TestFabrickSV5.object;

public class TransactionEnumerator {

	private String enumeration;
	private String value;
	
	
	//	Constructors
	
	public TransactionEnumerator(String enumeration, String value) {
		this.enumeration = enumeration;
		this.value = value;
	}

	public TransactionEnumerator() {
	}
	
	// Getters
	
	public String getEnumeration() {
		return this.enumeration;
	}

	public String getValue() {
		return this.value;
	}
	
}
