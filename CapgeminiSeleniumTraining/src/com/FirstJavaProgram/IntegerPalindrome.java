package com.FirstJavaProgram;

import java.util.Scanner;

public class IntegerPalindrome {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter Your two or more digit Positive Number to Check Palindrome");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n < 10) {
			System.out.println("Please Enter a two or more digit positive number Only");
			n = sc.nextInt();
			if (n < 10) {
				System.out.println("Maximum Chance Limit Crossed!!");
				System.exit(0);
			}
		}
		int x, reverse = n, sum = 0;
		while (n > 0) {
			x = n % 10;
			sum = sum * 10 + x;
			n = n / 10;
		}
		if (sum == reverse)
			System.out.println("The Number is Palindrome");
		else
			System.out.println("The Number is NOT Palindrome");
	}
}
