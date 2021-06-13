package com.FirstJavaProgram;

import java.util.Scanner;

public class Factorial {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int num,f=1;
		System.out.println("Enter the number to calculate factorial");
		Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
		for(int i=1;i<=num;i++)
			f=f*i;
		System.out.println("The Factorial of "+num+" is: "+f);

	}

}
