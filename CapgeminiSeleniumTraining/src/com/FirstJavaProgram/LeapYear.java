package com.FirstJavaProgram;
import java.util.Scanner;
public class LeapYear 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Enter the year to Check Leap Year or Not");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year%100==0)
			if(year%400==0)
				System.out.println("Entered Year "+year+" is a leap year");
			else System.out.println("Entered Year "+year+" is NOT a leap year");
		else if (year%100 != 0)
			if(year%4==0)
				System.out.println("Entered Year "+year+" is a leap year");
			else System.out.println("Entered Year "+year+" is NOT a leap year");
	}

}
