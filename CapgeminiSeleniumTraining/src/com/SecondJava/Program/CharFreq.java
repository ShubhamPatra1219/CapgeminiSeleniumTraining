package com.SecondJava.Program;

import java.util.Scanner;

public class CharFreq {

	public void frequency(String str) 
	{
		for(int i=0;i<str.length();i++)
		{
			int n = 1;
			for(int j=i+1;j<str.length();j++)
			{
				if(str.charAt(i)==str.charAt(j))
					n++;
			}
			if(n>1)
				if(str.charAt(i)==' ')
					System.out.println("The Frequency of Space is: "+n);
				else System.out.println("The Frequency of "+str.charAt(i)+" is: "+n);
		}
		System.out.println("Rest Characters have frequency as 1");
	}	
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		System.out.println("Please Enter Your String:");
		Scanner sc =new Scanner(System.in);
		String st = sc.nextLine();
		CharFreq obj = new CharFreq();
		obj.frequency(st);
	}
}
