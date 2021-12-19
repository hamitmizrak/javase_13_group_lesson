package com.ecodation.optional;

import java.util.Optional;

public class PermaLink {
	// https://www.baeldung.com/java-optional
	// https://kodedu.com/2014/10/java-8-optional-yeniligi/
	
	public static void main(String[] args) {
		String para = null;
		Optional<String> temp = Optional.ofNullable(para);
		
		// String is = null;
		//
		// if (is.equals("Malatya")) {
		// System.out.println("VAr");
		// } else {
		// System.out.println("sadgd");
		// }
	}
}
