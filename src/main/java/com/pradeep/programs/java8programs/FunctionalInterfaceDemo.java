package com.pradeep.programs.java8programs;

@FunctionalInterface
interface MultiplicationFI{
	int multiply(int a,int b);
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		
		MultiplicationFI multiplicationFI=(a,b)->a*b;
		System.out.println("Result :: "+multiplicationFI.multiply(6, 7));
	}

}
