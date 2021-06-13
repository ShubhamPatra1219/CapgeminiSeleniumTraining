package com.FirstJavaProgram;
import java.util.Scanner;
public class PrimeCheck 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int x = 0, n;
		System.out.println("Enter Your Number to Check Prime or Not");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		if(n==0 || n==1)
			System.out.println("Entered Number "+n+" is neither a Prime nor a Composite number.");
		for (int i=2;i<=n;i++)
		{
			if(i==n)
				x=1;
			else x=n%i;
			if(x==0)
			{
				System.out.println("Entered Number "+n+" is a Composite Number");
				break;
			}
		}
		if(x!=0)System.out.println("Entered Number "+n+" is a Prime Number");
	}

}
