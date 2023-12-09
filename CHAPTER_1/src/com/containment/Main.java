// write an example of containment

package com.containment;

class Containment1 {

	void meth1() {
		System.out.println("This is method 1");
	}

	void meth2() {
		System.out.println("This is method 2");
	}

}

class Containment2 {

	Containment1 con1 = new Containment1();

}

public class Main {

	public static void main(String[] args) {

		Containment2 con2 = new Containment2();

		con2.con1.meth1();

	}

}
