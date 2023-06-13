package com.credibanco.Dependencias.utils;

import java.util.Base64;

public class Encriptar {
	
	public static String cardEncrypt (String numberCard) {
		
		byte[] byteCard = numberCard.getBytes();
		
		byte[] byteCrypt =Base64.getEncoder().encode(byteCard);
		
		String cardEncrypt = new String (byteCrypt);
		
		return cardEncrypt;
		
	}

}
