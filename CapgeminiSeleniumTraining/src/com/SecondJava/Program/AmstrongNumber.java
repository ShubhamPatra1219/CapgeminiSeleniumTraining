package com.SecondJava.Program;

import java.util.Scanner;

public class AmstrongNumber {
	
	public boolean amstrong(int n) {
		boolean am =false;
		int ams = 0,r=0,temp=n;
		while(n>0)
		{
			r=n%10;
			//System.out.println("The Remainder is:"+r);
			ams = ams+r*r*r;
			//System.out.println("The Summation is:"+ams);
			n=n/10;
			//System.out.println("The Number after Divide:"+n);
		}
		if(ams==temp)
			am=true;
		else am=false;
		return am;
	}

	public static void main(String[] args) {
		
		System.out.println("Please Enter a Number to Check Amstrong:");
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		int num = sc.nextInt();
		AmstrongNumber obj = new AmstrongNumber();
		if(obj.amstrong(num)==true)
			System.out.println("The Number is Amstrong");
		else System.out.println("The Number is not Amstronmg");
	}

}
