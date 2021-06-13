package com.FirstJavaProgram;

import java.util.Scanner;

public class SwapTemp {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int a,b,temp;
		System.out.println("Enter First Number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		temp = a;
		a = b;
		b = temp;
		System.out.println("After Swaping, First No: "+a+" and Second Number: "+b);
	}

}
