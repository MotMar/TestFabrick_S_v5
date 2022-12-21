package it.matteo.TestFabrickSV5.object;

import com.fasterxml.jackson.annotation.JsonAlias;

public class TaxRelief {

	private String taxReliefId;
	@JsonAlias({"isCondoUpgrade"})
	private boolean isCondoUpgrade;
	private String creditorFiscalCode;
	private String beneficiaryType;
	private NaturalPersonBeneficiaries naturalPersonBeneficiary;
	private LegalPersonBeneficiary legalPersonBeneficiary;
	
	
	//	Constructors
	
	public TaxRelief(String taxReliefId, boolean isCondoUpgrade, String creditorFiscalCode, String beneficiaryType,
			NaturalPersonBeneficiaries naturalPersonBeneficiary, LegalPersonBeneficiary legalPersonBeneficiary) {
		this.taxReliefId = taxReliefId;
		this.isCondoUpgrade = isCondoUpgrade;
		this.creditorFiscalCode = creditorFiscalCode;
		this.beneficiaryType = beneficiaryType;
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}
	
	public TaxRelief() {
	}

	
	//	Getters and Setters
	
	public String getTaxReliefId() {
		return this.taxReliefId;
	}

	public boolean isCondoUpgrade() {
		return this.isCondoUpgrade;
	}

	public String getCreditorFiscalCode() {
		return this.creditorFiscalCode;
	}

	public String getBeneficiaryType() {
		return this.beneficiaryType;
	}

	public NaturalPersonBeneficiaries getNaturalPersonBeneficiary() {
		return this.naturalPersonBeneficiary;
	}

	public LegalPersonBeneficiary getLegalPersonBeneficiary() {
		return this.legalPersonBeneficiary;
	}

	public void setTaxReliefId(String taxReliefId) {
		this.taxReliefId = taxReliefId;
	}

	public void setCondoUpgrade(boolean isCondoUpgrade) {
		this.isCondoUpgrade = isCondoUpgrade;
	}

	public void setCreditorFiscalCode(String creditorFiscalCode) {
		this.creditorFiscalCode = creditorFiscalCode;
	}

	public void setBeneficiaryType(String beneficiaryType) {
		this.beneficiaryType = beneficiaryType;
	}

	public void setNaturalPersonBeneficiary(NaturalPersonBeneficiaries naturalPersonBeneficiary) {
		this.naturalPersonBeneficiary = naturalPersonBeneficiary;
	}

	public void setLegalPersonBeneficiary(LegalPersonBeneficiary legalPersonBeneficiary) {
		this.legalPersonBeneficiary = legalPersonBeneficiary;
	}

}
