//create a class which contains static and non-static members at least with two variabel and two members to acces it.

package com.staticc;

class Emp {

// Non-static variables
	String name = "Adarsh";
	int age = 20;

// static variables
	static String name1 = "Raj";
	static int age1 = 21;

// non-static method
	void showName() {
		System.out.println(name);
	}

	void showAge() {
		System.out.println(age);
	}

// static method
	static void showName1() {
		System.out.println(name1);
	}

	static void showAge1() {
		System.out.println(age1);
	}

}

public class Main {

	public static void main(String[] args) {

		Emp emp = new Emp();

		// Accesing static methods
		Emp.showName1();
		Emp.showAge1();

		// Accesing non-staic methods
		emp.showName();
		emp.showAge();

	}

}
