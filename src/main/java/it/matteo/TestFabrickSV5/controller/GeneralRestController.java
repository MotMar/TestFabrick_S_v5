package it.matteo.TestFabrickSV5.controller;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import it.matteo.TestFabrickSV5.constant.Constant;
import it.matteo.TestFabrickSV5.dto.AccountTransactionResponse;
import it.matteo.TestFabrickSV5.dto.GenericResponse;
import it.matteo.TestFabrickSV5.util.Utils;

@RequestMapping(value = Constant.BASE_PATH)
@RestController
public class GeneralRestController {

	@RequestMapping("/getBalanceByAccId")
	public ResponseEntity<?> getAvailableBalanceByAccountId() {

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Void> requestEntity = new HttpEntity<>(Utils.createHeaders());

		try {
			return restTemplate.exchange(Utils.getCorrectUri(1), HttpMethod.GET, requestEntity, GenericResponse.class);			
		} catch (HttpClientErrorException e) {
			return new ResponseEntity<String>(e.getResponseBodyAsString(), e.getStatusCode());
		}
	}


	@RequestMapping("/getTransactionsByAccId")
	public ResponseEntity<?> getTransactions(@RequestParam(name = "fromAccountingDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate fromAccountingDate,
			@RequestParam(name = "toAccountingDate") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate toAccountingDate) {

		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Void> requestEntity = new HttpEntity<>(Utils.createHeaders());

		try {
			return restTemplate.exchange(Utils.getCorrectUri(2, fromAccountingDate, toAccountingDate), HttpMethod.GET, requestEntity, AccountTransactionResponse.class);

		}catch (HttpClientErrorException e) {
			return new ResponseEntity<String>(e.getResponseBodyAsString(), e.getStatusCode());
		}
	}


	@RequestMapping(value= "/new-moneyTransfer", method = RequestMethod.POST)
	public ResponseEntity<String> insertMoneyTransfer() {

		RestTemplate restTemplate = new RestTemplate();

		String bodyRequestJson = "{"
				+ "  \"creditor\": {"
				+ "    \"name\": \"John Doe\","
				+ "    \"account\": {"
				+ "      \"accountCode\": \"IT23A0336844430152923804660\","
				+ "      \"bicCode\": \"SELBIT2BXXX\""
				+ "    },"
				+ "    \"address\": {"
				+ "      \"address\": null,"
				+ "      \"city\": null,"
				+ "      \"countryCode\": null"
				+ "    }"
				+ "  },"
				+ "  \"executionDate\": \"2019-04-01\","
				+ "  \"uri\": \"REMITTANCE_INFORMATION\","
				+ "  \"description\": \"Payment invoice 75/2017\","
				+ "  \"amount\": 800,"
				+ "  \"currency\": \"EUR\","
				+ "  \"isUrgent\": false,"
				+ "  \"isInstant\": false,"
				+ "  \"feeType\": \"SHA\","
				+ "  \"feeAccountId\": \"45685475\","
				+ "  \"taxRelief\": {"
				+ "    \"taxReliefId\": \"L449\","
				+ "    \"isCondoUpgrade\": false,"
				+ "    \"creditorFiscalCode\": \"56258745832\","
				+ "    \"beneficiaryType\": \"NATURAL_PERSON\","
				+ "    \"naturalPersonBeneficiary\": {"
				+ "      \"fiscalCode1\": \"MRLFNC81L04A859L\","
				+ "      \"fiscalCode2\": null,"
				+ "      \"fiscalCode3\": null,"
				+ "      \"fiscalCode4\": null,"
				+ "      \"fiscalCode5\": null"
				+ "    },"
				+ "    \"legalPersonBeneficiary\": {"
				+ "      \"fiscalCode\": null,"
				+ "      \"legalRepresentativeFiscalCode\": null"
				+ "    }"
				+ "  }"
				+ "}";

		HttpEntity<String> requestEntity = new HttpEntity<String>(bodyRequestJson,Utils.createHeaders(""));

		try {
			return restTemplate.postForEntity(Utils.getCorrectUri(3), requestEntity, String.class);

		} catch (HttpClientErrorException e) {
			return new ResponseEntity<String>(e.getResponseBodyAsString(), e.getStatusCode());
		}
	}
}