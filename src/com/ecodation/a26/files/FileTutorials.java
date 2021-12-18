package com.ecodation.a26.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FileTutorials {
	
	public static String getScanner() {
		return JOptionPane.showInputDialog("lütfen birşeyler yazınız");
	}
	
	// dosya yazmak
	public static void getWriter(String value) {
		// monad
		try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(FilePath.FILE_PATH, true))) {
			bufferedWriter.write(value);
			bufferedWriter.flush();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	// dosya okumak
	public static void getReader() {
		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(FilePath.FILE_PATH))) {
			
			String satir = "", okunan = "";
			while ((satir = bufferedReader.readLine()) != null) {
				okunan = okunan + satir + "\n";
			}
			System.out.println(okunan);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		// getWriter(getScanner());
		getReader();
	}
}
