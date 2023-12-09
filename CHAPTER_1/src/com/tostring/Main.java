//create a class emp add its attributes like name, id, sal, address and display all the information and also display with toString also

package com.tostring;

class Emp {

	String name = "Adarsh";
	int id = 07;
	double sal = 134254;
	String address = "Poisar, Kandivali";

	@Override
	public String toString() {
		return "Emp [name=" + name + ", id=" + id + ", sal=" + sal + ", address=" + address + "]";
	}

}

public class Main {

	public static void main(String[] args) {

		Emp emp = new Emp();

		System.out.println(emp.name);
		System.out.println(emp.id);
		System.out.println(emp.sal);
		System.out.println(emp.address);

		// Displaying with toString
		System.out.println(emp);
	}

}
