package com.learning.core.Day3Session2.maps8;

import java.util.Map;
import java.util.TreeMap;

public class TestCar {
	public static void main(String[] args) {

		TreeMap<Car, String> carTreeMap = new TreeMap<>();

		Car car1 = new Car("Bugatti", 80050);

		Car car2 = new Car("Swift", 305000);

		Car car3 = new Car("Audi", 600100);

		Car car4 = new Car("Benz", 900000);

		carTreeMap.put(car1, car1.getName());

		carTreeMap.put(car2, car2.getName());

		carTreeMap.put(car3, car3.getName());

		carTreeMap.put(car4, car4.getName());

		Map.Entry<Car, String> greatestPriceEntry = carTreeMap.lastEntry();

		System.out.println("Greatest price:");

		System.out.println(greatestPriceEntry.getKey() + " -> " + greatestPriceEntry.getValue());
	}

}
