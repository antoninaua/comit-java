package org.comit.course._02_operators;

public class Relational {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 8;
		
		boolean equalTo = a==b;
		boolean notEqual = a!=b;
		boolean greaterThan = a>b;
		boolean lessThan = a<b;
		boolean greaterThanEqual = a>=b;
		boolean lessThanEqual = a<=b;
		
		System.out.println("Equal To: " + equalTo);
		System.out.println("Not Equal To: " + notEqual);
		System.out.println("Greater Than: " + greaterThan);
		System.out.println("Less Than: " + lessThan);
		System.out.println("Greater Than Equal: " + greaterThanEqual);
		System.out.println("Less than Equal: " + lessThanEqual);

	}

}
