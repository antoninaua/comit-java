package org.comit.course._flow_control;

public class IfStatement {

	public static void main(String[] args) {
		
	   
		int a = 28;
		int b = 20;
		
		if (a > b) {
			System.out.println("a is greater than b");
			System.out.println("a is greater than b");
		}
        else if (a < b) {
			System.out.println("a is less than b");
		}
		else {
			System.out.println("a is equal than b");

		}
		
		int c = 25;
		if ((a > b) && (a > c )) {
			System.out.println("a is bigger than b and bigger than c");
		}
		
		a = 10;
		b = 15;
		
		String str;
		
		if (a > b) {
			str = "a greater than b";
		}
		else {
			str = "a less than b";
		}
		
		// Ternary Operator
		str = (a > b) ? "a greater than b" : "a less than b";
	}

}
