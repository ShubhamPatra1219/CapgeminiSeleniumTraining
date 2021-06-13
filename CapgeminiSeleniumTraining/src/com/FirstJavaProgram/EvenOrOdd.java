package com.FirstJavaProgram;

import java.util.Scanner;

public class EvenOrOdd 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the number to Check Even or Odd");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
        if(num%2==0)
			System.out.println("Entered Number "+num+" is Even");
		else System.out.println("Entered Number "+num+" is Odd");
	}
}
