package com.SecondJava.Program;

import java.util.Scanner;

public class OppositeNumberPattern {

	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Please Enter a Number to Print Opposite Pattern:");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The Pattern is as bellow:-");
		for(int i=n;i>0;i--)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
