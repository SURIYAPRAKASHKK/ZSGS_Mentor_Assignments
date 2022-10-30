package RajeeSanDailyProblems;

import java.util.Scanner;

public class BitMultiply {
	/*
 4. Do the following problems without using multiplication or division operators 
a) Multiply a given integer with 15
b) Multiply a given even integer with 7.5
c) Calculate value of 15 × n/16 
	 */
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		System.out.print("Enter your Number: ");
		int n = sc.nextInt();
		multiplyOperation(n);
	}
	
	public static void multiplyOperation(int x) {
		
		int operationA = (x << 4) - x;
		System.out.println("Multiply With 15  :  "+operationA);
		System.out.println("Multiply with 7.5 :  "+operationA/2.0);
		System.out.println("Value of 15 × n/16 :  "+operationA/16.0);
		
		
	}

}
