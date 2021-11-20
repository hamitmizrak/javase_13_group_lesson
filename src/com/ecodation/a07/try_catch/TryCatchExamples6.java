package com.ecodation.a07.try_catch;

import java.sql.Connection;
import java.sql.SQLException;

// import java.util.*; ==> util paketindeki bütün metotları çağır

public class TryCatchExamples6 {
	
	public static void main(String[] args) throws SQLException {
		
		Connection connection = null;
		// try -with resources
		try {
			System.out.println("1.satır");
			int sayi = 4 / 0;
		} catch (Exception e) {
			e.printStackTrace();
			throw (e);
		} finally {
			// finally zorunlu olarak kapatılması gereken kodları kapatır.
			// database.close()
			// kalvye.close();
			// socket kapat
			connection.close();
		}
		
	}
	
}
