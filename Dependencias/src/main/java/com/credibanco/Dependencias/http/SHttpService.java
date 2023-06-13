package com.credibanco.Dependencias.http;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;

import com.credibanco.Dependencias.dto.UsuarioDTORequest;

public class SHttpService {
	
	public static HttpEntity getHttpEntity(UsuarioDTORequest userDto) {
		return new HttpEntity(userDto,getHttpHedersJson());
	}
	public static HttpHeaders getHttpHedersJson() {
		HttpHeaders headers = new HttpHeaders();
		headers.add("content-Type","application/json");
		headers.add("Accept","application/json");
		return headers;
	}

}
