package org.comit.course._02_operators;

public class Logical {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		
		boolean and = a && b; // if one of the operands is false then result is false:
		boolean or = a || b; // if one of the operands is true then result is true;
		boolean not = !a; // the reverse;
		
		System.out.println(and);
		System.out.println(or);
		System.out.println(not);
		
		

	}

}
