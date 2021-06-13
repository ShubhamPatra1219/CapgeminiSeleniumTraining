package com.FirstJavaProgram;
import java.util.Scanner;
public class Fibonacci 
{
	public static void main(String[] args) 
	{
		int a = 0, b = 1, c = 0;
		System.out.println("Enter then length of Fibonacci Series:");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {
			c = a + b;
			if (i < n)
				System.out.print(a + ",");
			else
				System.out.print(a);
			a = b;
			b = c;
		}
	}
}