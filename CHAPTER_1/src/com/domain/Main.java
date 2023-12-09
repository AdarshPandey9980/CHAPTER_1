// abstract the following domain: HOSPITAL

package com.domain;

abstract class Hospital {

	abstract void showName();

	abstract void showID();

	abstract void showAddress();

	abstract void showAge();

	void showSal(int salary) {
		System.out.println("The salary of watchman is:" + (salary));
	}

	void showSal(int salary, int tax) {
		System.out.println("The salary of doctor is:" + (salary + tax));
	}
}

class Doctor extends Hospital {
	String name = "Dr.raj";
	int id = 132;
	String address = "Kandivali";
	int age = 43;

	@Override
	void showName() {
		System.out.println("Name:" + name);
	}

	@Override
	void showID() {
		System.out.println("ID:" + id);
	}

	@Override
	void showAge() {
		System.out.println("Age:" + age);
	}

	@Override
	void showAddress() {
		System.out.println("Address:" + address);
	}

	@Override
	void showSal(int salary, int tax) {
		System.out.println("Salary:" + (salary + tax));
	}
}

class Watchman extends Hospital {
	String name = "Aman";
	int id = 20;
	String address = "Borivali";
	int age = 30;

	@Override
	void showName() {
		System.out.println("Name:" + name);
	}

	@Override
	void showID() {
		System.out.println("ID:" + id);
	}

	@Override
	void showAge() {
		System.out.println("Age:" + age);
	}

	@Override
	void showAddress() {
		System.out.println("Address:" + address);
	}

	@Override
	void showSal(int salary) {
		System.out.println("Salary:" + (salary));
	}

}

public class Main {

	public static void main(String[] args) {
		
		int salaryd = 40000;
		int salaryw = 15000;
		int tax = 2000;
		
		Doctor doctor = new Doctor();
		Watchman watchman = new Watchman();
		
		doctor.showName();
		doctor.showAge();
		doctor.showID();
		doctor.showAddress();
		doctor.showSal(salaryd, tax);
		
		System.out.println();
		
		watchman.showName();
		watchman.showAge();
		watchman.showID();
		watchman.showAddress();
		watchman.showSal(salaryw);
		
	}
}
