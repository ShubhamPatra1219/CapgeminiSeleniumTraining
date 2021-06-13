package com.FirstJavaProgram;

import java.util.Scanner;

public class IntegerArrayOperation {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Taking User Input for Array
		System.out.println("Enter The Length of Array:");
		Scanner sc = new Scanner(System.in);
		int len = sc.nextInt();
		
		//Array Creation
		int [] a = new int[len];
		for (int i = 0; i < len;i++)
		{
			System.out.println("Please enter the number#"+(i+1)+": ");
			Scanner sc1 = new Scanner(System.in);
			a[i] = sc1.nextInt();
		}		
		
		//Duplicate Check
		int n=0;
		for (int x = 0; x<len; x++)
			for (int y=x+1;y<len;y++)
				if(a[x]==a[y])
				{
					System.out.println("The Duplicate Number is: "+a[x]);
					n++;
					break;
				}
		System.out.println("Total number duplicate entities are: "+n);		
		
		//Largest and Smallest Number Check
		int large = 0,small = 0;
		for (int k=0;k<len;k++)
		{
			for (int l =k+1;k<len;k++)
			{
				if(a[k]<a[l])
					small=a[k];
				if(a[k]>a[l])
					large=a[k];
			}
		}
		System.out.println("The Largest Number is: "+large+" and The Samllest Number is: "+small);
	}

}
