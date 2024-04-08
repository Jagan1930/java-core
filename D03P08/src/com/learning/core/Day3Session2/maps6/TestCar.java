package com.learning.core.Day3Session2.maps6;

import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class TestCar {
	public static void main(String[] args) {

		TreeMap<Car, String> carTreeMap = new TreeMap<>(Collections.reverseOrder());

		Car car1 = new Car("Bugatti", 80050);

		Car car2 = new Car("Swift", 305000);

		Car car3 = new Car("Audi", 600100);

		Car car4 = new Car("Benz", 900000);

		carTreeMap.put(car1, car1.getName());

		carTreeMap.put(car2, car2.getName());

		carTreeMap.put(car3, car3.getName());

		carTreeMap.put(car4, car4.getName());

		System.out.println("Car prices in reverse order:");

		for (Map.Entry<Car, String> entry : carTreeMap.entrySet()) {

			System.out.println(entry.getKey().getPrice() + ": " + entry.getValue());

		}

	}

}
