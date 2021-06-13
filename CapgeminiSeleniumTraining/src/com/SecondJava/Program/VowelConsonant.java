package com.SecondJava.Program;

import java.util.Scanner;

public class VowelConsonant {
	
	public void VCcount(String x)
	{
		int vCount = 0, cCount= 0;
		x=x.trim();
		x=x.toUpperCase();
        for(int i=0;i<x.length();i++)
		{
				if(x.charAt(i)=='A'||x.charAt(i)=='E'||x.charAt(i)=='I'||x.charAt(i)=='O'||x.charAt(i)=='U')
					vCount++;
				else if(x.charAt(i) >= 'A' && x.charAt(i)<= 'Z')
					cCount++;
		}	
		System.out.println("The Number of Vowels:"+vCount);
		System.out.println("The Number of Consonants:"+cCount);
	}

	public static void main(String[] args) {
		// Program to Calculate Number of Vowel and Consonant in a sentence.
		System.out.println("Please Enter a sentence:");
		@SuppressWarnings("resource")
		Scanner sc =new Scanner(System.in);
		String str = sc.nextLine();
		VowelConsonant obj = new VowelConsonant();
		obj.VCcount(str);
	}

}
