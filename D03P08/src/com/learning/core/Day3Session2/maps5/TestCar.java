package com.learning.core.Day3Session2.maps5;

import java.util.Map;
import java.util.TreeMap;

public class TestCar {
	public static void main(String[] args) {

		Car car1 = new Car("Bugatti", 80050);

		Car car2 = new Car("Swift", 305000);

		Car car3 = new Car("Audi", 600100);

		Car car4 = new Car("Benz", 900000);

		TreeMap<Car, String> carMap = new TreeMap<>();

		carMap.put(car1, "Car1 Details");

		carMap.put(car2, "Car2 Details");

		carMap.put(car3, "Car3 Details");

		carMap.put(car4, "Car4 Details");

		for (Map.Entry<Car, String> entry : carMap.entrySet()) {

			System.out.println(entry.getValue() + ": " + entry.getKey());

		}

	}

}
