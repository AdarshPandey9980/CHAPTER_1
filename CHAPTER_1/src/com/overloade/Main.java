//show an example of method overlodaing (REAL TIME CASE STUDY)

package com.overloade;

class Emp {

	void showSal(int salManager, int taxManager) {
		System.out.println("The salary of Manager is: " + (salManager + taxManager));
	}

	void showSal(int salWorker) {
		System.out.println("The salary of worker is:" + (salWorker));
	}

}

public class Main {

	public static void main(String[] args) {
		int salManager = 134344;
		int taxManager = 4354;
		int salWorker = 15000;

		Emp emp = new Emp();

		emp.showSal(salWorker);
		emp.showSal(salManager, taxManager);
	}
}
