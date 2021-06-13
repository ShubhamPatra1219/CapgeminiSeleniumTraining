package com.FirstJavaProgram;

import java.util.Scanner;

public class SwapNoTemp {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		int a,b;
		System.out.println("Enter First Number");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		System.out.println("Enter Second Number");
		b = sc.nextInt();
		a = a+b;
		b = a-b;
		a=a-b;
		System.out.println("After Swaping, First No: "+a+" and Second Number: "+b);

	}

}
