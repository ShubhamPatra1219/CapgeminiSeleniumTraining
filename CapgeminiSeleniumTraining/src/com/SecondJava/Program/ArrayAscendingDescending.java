package com.SecondJava.Program;

import java.util.Scanner;

public class ArrayAscendingDescending {
	
	public void ascendingArray(int x[])
	{
		int temp = 0, n=x.length;
		for (int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if (x[i]>x[j])
				{
					temp = x[i];
					x[i]=x[j];
					x[j]=temp;
				}
		System.out.println("Please Find the Array in Ascending Order:-");
		for(int i =0;i<n;i++)
			System.out.println(x[i]);;
	}
	public void descendingArray(int x[])
	{
		int temp = 0, n=x.length;
		for (int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if (x[i]<x[j])
				{
					temp = x[i];
					x[i]=x[j];
					x[j]=temp;
				}
		System.out.println("Please Find the Array in Ascending Order:-");
		for(int i =0;i<n;i++)
			System.out.println(x[i]);;
	}
	
	public int[] getValues() 
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the Length of the Array:-");
		int n=sc.nextInt();
		int []a = new int[n];
		for(int i=1;i<=n;i++)
		{
			System.out.println("Enter No."+i);
			a[i-1]=sc.nextInt();
		}
		return a;
	}
	public static void main(String[] args) 
	{
		ArrayAscendingDescending obj = new ArrayAscendingDescending();
		int []a=obj.getValues();
		obj.ascendingArray(a);
		obj.descendingArray(a);
	}

}


