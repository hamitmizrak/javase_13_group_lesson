package com.ecodation.a16.inheritance_lesson;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder; // md5

import javax.swing.JOptionPane;

public class DecoderEncoderJwt {
	// şifre oluştur
	// şifre çöz
	
	// Amed
	// QW1lZA==
	
	// Scanner
	public static String getScanner() {
		return JOptionPane.showInputDialog("lütfen birşeyler yazınız");
	}
	
	// şifreleme
	public static String getEncoder(String value) {
		Encoder encoder = Base64.getEncoder();
		return encoder.encodeToString(value.getBytes());
	}
	
	// şifre çözücü
	public static void getDecoder(String value) {
		Decoder decoder = Base64.getMimeDecoder();
		String str = new String(decoder.decode(value));
		System.out.println(value + " Şifresi çözüldü: " + str);
	}
	
	public static void main(String[] args) {
		// monad
		getDecoder(getEncoder(getScanner()));
	}
	
}
