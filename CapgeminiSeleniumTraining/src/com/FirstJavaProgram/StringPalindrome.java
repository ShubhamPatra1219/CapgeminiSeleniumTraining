package com.FirstJavaProgram;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {

		System.out.println("Please Enter a String to Check Palindrome");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		int n = str.length();
		for (int i = 0; i <= n-1; i++){
				if (str.charAt(i) != str.charAt(n-1-i)) {
					System.out.println("The String is not Palindrome");
					System.exit(0);
				}
			}
		System.out.println("The Entered String is Palindrome");
	}

}
