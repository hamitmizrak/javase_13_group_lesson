package com.ecodation.a14.uuid;

import java.util.UUID;

public class UUIDRandomHex {
	public static void main(String[] args) {
		// uuid:32 hexadecimal
		// benzersiz aynı olmayan 32 karakterli
		UUID rastgele32 = UUID.randomUUID();
		System.out.println(rastgele32);
		
	}
}
