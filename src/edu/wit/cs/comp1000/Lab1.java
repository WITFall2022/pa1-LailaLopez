package edu.wit.cs.comp1000;

import java.util.Scanner;

public class Lab1 {

	


	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		
		double num1;
		double num2;
		double num3;
		double num4;
		double num5;
		System.out.printf("Enter five numbers: ");
		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		
		double sum = num1 + num2 + num3 + num4 + num5;
		
		System.out.printf("sum : %.2f%n", sum);
		
		double mean = sum/5;
		System.out.printf("Mean: %.2f%n" , mean);
		
		double step1a = (num1 - mean);
		double step1b = (num2 - mean);
		double step1c = (num3 - mean);
		double step1d = (num4 - mean);
		double step1e = (num5 - mean);
		
		double step2a = Math.pow(step1a, 2);
		double step2b = Math.pow(step1b, 2);
		double step2c = Math.pow(step1c, 2);
		double step2d = Math.pow(step1d, 2);
		double step2e = Math.pow(step1e, 2);
		
		double step3 = step2a + step2b + step2c + step2d + step2e;
		
		double step4 = step3/5;
		
		double step5 = Math.sqrt(step4);
		
		System.out.printf("Population Standard Deviation: %.2f%n", step5);
		// TODO Auto-generated method stub

	}

}
