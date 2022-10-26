package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1b {

	// TODO: document this function
	public static void main(String[] args) {Scanner input = new Scanner(System.in);

	int Totalinches;

	System.out.printf("Enter number of Inches:");

	Totalinches = input.nextInt();

	int yards;

	yards = Totalinches / 36;

	System.out.printf("yards:%d%n", yards);

	int feet;

	feet = Totalinches % 36 / 12;

	System.out.printf("feet:%d%n", feet);

	int inches;

	inches = Totalinches % 36 % 12 / 1;

	System.out.printf("inches :%d%n", inches);


		// TODO: write your code here
	}

}
