package com.learning.core.Day3Session2.maps1;

import java.util.HashMap;
import java.util.Map;

public class TestPhoneBook {
	public static void main(String args[]) {
		HashMap<String, String> hm = new HashMap<>();
		hm.put("John", "9988998800");
		hm.put("Henry", "9988776699");
		hm.put("Harry", "9900990088");
		hm.put("Mario", "7788990000");
		hm.put("Anne", "8877990000");
		
		for (Map.Entry<String, String> entry : hm.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
	}

}
