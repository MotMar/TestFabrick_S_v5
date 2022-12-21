package it.matteo.TestFabrickSV5.object;

public class LegalPersonBeneficiary {

	private String fiscalCode;
	private String legalRepresentativeFiscalCode;
	
	
	//	Constructors
	
	public LegalPersonBeneficiary(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public LegalPersonBeneficiary() {
	}

	
	//	Getters and Setters
	
	public String getFiscalCode() {
		return fiscalCode;
	}

	public String getLegalRepresentativeFiscalCode() {
		return legalRepresentativeFiscalCode;
	}

	public void setFiscalCode(String fiscalCode) {
		this.fiscalCode = fiscalCode;
	}

	public void setLegalRepresentativeFiscalCode(String legalRepresentativeFiscalCode) {
		this.legalRepresentativeFiscalCode = legalRepresentativeFiscalCode;
	}

}
