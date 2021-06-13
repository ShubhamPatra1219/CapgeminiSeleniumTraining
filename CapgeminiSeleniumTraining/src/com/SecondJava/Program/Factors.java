package com.SecondJava.Program;
import java.util.Scanner;
public class Factors {
	public void factorial(int x)
	{
		//Factors to Identify
		int [] a = new int [x];
		for (int y=1;y<=x;y++)
			if(x%(y)==0)
				a[y-1]=y;
		System.out.println("The Factors of Number:"+x+" are:-");
		for (int j=0;j<=x-1;j++)
			if(j<x-1 && a[j]!=0)
			System.out.print(a[j]+",");
			else if(j==x-1 && a[j]!=0)System.out.print(a[j]);
	}
	public int getNumber() 
	{
		//Method to Input a Number
		System.out.println("Enter a Integer Number to find factors:");
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		return num;
	}
	public static void main(String[] args) 
	{
		// Program to Print Factors of a Number.
		Factors obj = new Factors();
        obj.factorial(obj.getNumber());
	}

}
