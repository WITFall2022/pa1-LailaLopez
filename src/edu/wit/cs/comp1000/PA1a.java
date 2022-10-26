package edu.wit.cs.comp1000;

import java.util.Scanner;
// TODO: document this class
public class PA1a {
	

	// TODO: document this function
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);

		int yards;
		int feet;
		int inches;

		System.out.printf("Enter yard value:");
		yards = input.nextInt();

		System.out.printf("Enter feet value:");
		feet = input.nextInt();

		System.out.printf("Enter inches value:");
		inches = input.nextInt();

		int ans;
		ans = feet*12+yards*36+inches;
		
		System.out.println(ans);

		// TODO: write your code here
	}

}
