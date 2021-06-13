package com.SecondJava.Program;

public class calculator {
	    public int addTwoNumbers(int a, int b) {
	        int sum =a+b;
	        return sum;
	    } 
	    public int subTwoNumbers(int a, int b) {
	        int sub = 0;
	        if(a>b)
	        	sub=a-b;
	        else sub = b-a;
	        return sub;
	    }
	    public int multiTwoNumbers(int a, int b) {
	    	int multi = a*b;
	        return multi;
	    }
	    public int divTwoNumbers(int a, int b) {
	    	   int div = 1;
		        if(a>b)
		        	div=a/b;
		        else div = b/a;
	        return div;
	    }
	    public static void main(String[] args) {
	        
	        // TODO Auto-generated method stub
	        calculator cal = new calculator();
	        System.out.println("The Addition Result is: "+cal.addTwoNumbers(150,320));
	        System.out.println("The Substruction Result is: "+cal.subTwoNumbers(150,320));
	        System.out.println("The Substruction Result is: "+cal.multiTwoNumbers(150,320));
	        System.out.println("The Substruction Result is: "+cal.divTwoNumbers(150,320));
	    }

	}
	 

