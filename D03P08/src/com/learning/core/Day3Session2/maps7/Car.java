package com.learning.core.Day3Session2.maps7;

import java.util.Objects;

public class Car implements Comparable<Car> {
	private String name;
	private float price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	}

	public Car(String name, float price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [name=" + name + ", price=" + price + "]";
	}

	@Override

	public int hashCode() {

		return Objects.hash(name, price);

	}

	@Override

	public boolean equals(Object obj) {

		if (this == obj)
			return true;

		if (obj == null || getClass() != obj.getClass())
			return false;

		Car car = (Car) obj;

		return Double.compare(car.price, price) == 0 && Objects.equals(name, car.name);

	}

	@Override

	public int compareTo(Car other) {

		return Double.compare(this.price, other.price);

	}

}
