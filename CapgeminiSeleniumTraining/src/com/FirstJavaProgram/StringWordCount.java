package com.FirstJavaProgram;

import java.util.Scanner;

public class StringWordCount {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Please Enter String to count word.");
		Scanner sc = new Scanner(System.in);
		String st = (sc.nextLine()).trim();
		int n = st.length();
		int count = 0;
		char ch[]= new char[st.length()];
		for(int i=0;i< n;i++)
		{
			ch[i] = st.charAt(i);
			if(ch[i]==' '|| ch[i]==','|| ch[i]==';')
				count++;
		}
		System.out.println("The Number of Words in the String: "+(count+1));
	}

}
