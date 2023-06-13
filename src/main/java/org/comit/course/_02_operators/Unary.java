package org.comit.course._02_operators;

public class Unary {

	public static void main(String[] args) {
		
		int a = 5;
		
		//a = a + 1;
		//a+=1;
		
		//a++;
		//++a;
		int b = a++; // Post Increment: delivers the value then increments 

		System.out.println("Post Increment");
		System.out.println("a: " + a); //6
		System.out.println("b: " + b); //5
		
		a = 5;
		b = ++a; // Pre Increment: increments then delivers the value
		
		System.out.println("Pre Increment");
		System.out.println("a: " + a); //6
		System.out.println("b: " + b); //6
		
		a = 5;
		b = a--; // Post Decrement: delivers the value then decrements; 

		System.out.println("Post Decrement");
		System.out.println("a: " + a); //4
		System.out.println("b: " + b); //5
		
		a = 5;
		b = --a; // Pre Decrement: decrements then delivers the value
		
		System.out.println("Pre Decrement");
		System.out.println("a: " + a); //4
		System.out.println("b: " + b); //4
		
		
		
	}

}
