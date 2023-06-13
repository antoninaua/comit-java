package org.comit.course._04_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {
		
		// Scanner - accepts user input.
		 
		// Scanner will be closed automatically
		
		// Note - Remember to clean a buffer if you need to read a String after using a number
		
	try(Scanner scan = new Scanner(System.in)) {
			 
		System.out.println("Please input your age: ");
		int age = scan.nextInt(); // Read an Integer from keyboard
		
		scan.nextLine(); // Cleans the buffer. 
		
		System.out.println("Please input your name: ");
		String name = scan.next(); // Read string from keyboard.
		
		
        System.out.println("Your name is: " + name + " and your age is: " + age);
        System.out.printf("Your name is: %s and your age is: %d %n", name, age);
		} 
		
		/*Scanner scan = new Scanner(System.in);
		
		System.out.println("Please input your name: ");
		String name = scan.next(); // Read string from keyboard.
		
		System.out.println("Please input your age: ");
		int age = scan.nextInt(); // Read an Integer from keyboard
		
		
		
        System.out.println("Your name is: " + name + " and your age is:" + age);
        System.out.printf("Your name is: %s and your age is: %d %n", name, age);
        
        scan.close();*/
	}

}
