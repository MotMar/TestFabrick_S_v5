package it.matteo.TestFabrickSV5.util;

import java.net.URI;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpHeaders;
import org.springframework.web.util.UriComponentsBuilder;

import it.matteo.TestFabrickSV5.constant.Constant;

public class Utils {
	
	public static HttpHeaders createHeaders() {
		HttpHeaders headers = new HttpHeaders();
		headers.add(Constant.HEADER_CONTENT_TYPE_DESC, Constant.HEADER_CONTENT_TYPE_VALUE);
		headers.add(Constant.HEADER_AUTH_SCHEMA_DESC, Constant.HEADER_AUTH_SCHEMA_VALUE);
		headers.add(Constant.HEADER_API_KEY_DESC, Constant.HEADER_API_KEY_VALUE);
		return headers;
	}
	
	public static HttpHeaders createHeaders(String timeZone) {
		HttpHeaders headers = new HttpHeaders();
		headers.add(Constant.HEADER_CONTENT_TYPE_DESC, Constant.HEADER_CONTENT_TYPE_VALUE);
		headers.add(Constant.HEADER_AUTH_SCHEMA_DESC, Constant.HEADER_AUTH_SCHEMA_VALUE);
		headers.add(Constant.HEADER_API_KEY_DESC, Constant.HEADER_API_KEY_VALUE);
		headers.add("X-Time-Zone", timeZone);
		return headers;
	}
	
	public static URI getCorrectUri(int selection) {
		Map<String, String> urlParams = new HashMap<>();
		urlParams.put("accountId", "14537780");
		
		UriComponentsBuilder builder;
		switch(selection) {
		case 1:
			builder = UriComponentsBuilder.fromUriString(Constant.BASE_API_URL.concat("/api/gbs/banking/v4.0/accounts/{accountId}/balance"));
			return builder.buildAndExpand(urlParams).toUri();
		case 3:
			builder = UriComponentsBuilder.fromUriString(Constant.BASE_API_URL.concat("/api/gbs/banking/v4.0/accounts/{accountId}/payments/money-transfers"));
			return builder.buildAndExpand(urlParams).toUri();
		default:
			return null;
		}
	}
	
	public static URI getCorrectUri(int selection, LocalDate localDate, LocalDate localDate2) {
		Map<String, String> urlParams = new HashMap<>();
		urlParams.put("accountId", "14537780");
		
		UriComponentsBuilder builder;
		switch(selection) {
		case 2:
			builder = UriComponentsBuilder.fromUriString(Constant.BASE_API_URL.concat("/api/gbs/banking/v4.0/accounts/{accountId}/transactions"))
			        .queryParam("fromAccountingDate", localDate)
			        .queryParam("toAccountingDate", localDate2);			
			return builder.buildAndExpand(urlParams).toUri();
		default:
			return null;
		}
	}
	
}
