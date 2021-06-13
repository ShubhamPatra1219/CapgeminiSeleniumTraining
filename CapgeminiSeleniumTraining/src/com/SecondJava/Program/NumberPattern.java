package com.SecondJava.Program;

import java.util.Scanner;

public class NumberPattern 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Please Enter a Number to Print Pattern:");
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("The Pattern is as bellow:-");
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
				System.out.print(j+" ");
			System.out.println();
		}
	}

}
