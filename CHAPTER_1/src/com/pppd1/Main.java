//show the uses of the following keywords 1) public 2) private 3) default 4) protected

package com.pppd1;

class Emp1 {

	public int a = 1;
	private int b = 2;
	protected int c = 3;
	int d = 4;

}

public class Main extends Emp1 {

	public static void main(String[] args) {
		Emp1 emp1 = new Emp1();

		System.out.println(emp1.a);
		System.out.println(emp1.c);
		System.out.println(emp1.d);

	}
}
