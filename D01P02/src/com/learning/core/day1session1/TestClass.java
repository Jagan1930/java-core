package com.learning.core.day1session1;

public class TestClass {
	public static void main(String[] args) {
		MedicineInfo tablet = new Tablet();
		MedicineInfo syrup  = new Syrup();
		MedicineInfo ointment = new Ointment();

		System.out.println();
		tablet.displayLabel();

		System.out.println();
		syrup.displayLabel();

		System.out.println();
		ointment.displayLabel();
		
	}

}
