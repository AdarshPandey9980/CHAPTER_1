//show an example of method overriding (REAL TIME CASE STUDY)

package com.override;

class Emp {

	void showSal(int salManager, int taxManager) {
		System.out.println("The salary of Manager is: " + (salManager + taxManager));
	}

	void showSal(int salWorker) {
		System.out.println("The salary of worker is:" + (salWorker));
	}

}

class Emp2 extends Emp {
	@Override
	void showSal(int salStaff) {
		System.out.println("The salary of staff is: " + (salStaff));
	}

	@Override
	void showSal(int salCEO, int taxCEO) {
		System.out.println("The salary of CEO is: " + (salCEO + taxCEO));
	}
}

public class Main {

	public static void main(String[] args) {

		int salManager = 134344;
		int taxManager = 4354;
		int salWorker = 15000;

		int salCEO = 1233453;
		int taxCEO = 9900;
		int salStaff = 25000;

		Emp emp = new Emp();
		Emp2 emp2 = new Emp2();

		emp.showSal(salWorker);
		emp.showSal(salManager, taxManager);

		emp2.showSal(salStaff);
		emp2.showSal(salCEO, taxCEO);

	}

}
