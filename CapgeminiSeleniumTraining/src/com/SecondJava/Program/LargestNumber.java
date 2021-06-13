package com.SecondJava.Program;

import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) 
	{
	   @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
	   System.out.println("Please Enter How Many Numbers You Want to Check");
	   int n = sc.nextInt();
	   int [] a = new int [n];
	   for (int i=1;i<=n;i++)
	   {
		   System.out.println("Please Enter Your "+i+"th Number:");
		   a[i-1]=sc.nextInt();
	   }
	   for (int j=0;j<n;j++)
		   for(int k=j+1;k<n;k++)
			   if(a[j]<a[k])
			   {
				   int temp =a[j];
				   a[j]=a[k];
				   a[k]=temp;
			   }
	   System.out.println("Please find the numbers from Largest to Smallest:-");
	   for(int x:a)
		   System.out.println(x);

	}

}
