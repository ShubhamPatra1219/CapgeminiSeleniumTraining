package com.SecondJava.Program;

public class AdditionDigits {

	public static void main(String[] args) {
		//Program to add digits of a number
		int a = 1234, sum =0, mod =0;
		while (a>0)
		{
			mod = a%10;
			sum = sum+mod;
			a=a/10;
		} 
		System.out.println("The Sum of digits of the number is: "+sum);
	}
}
