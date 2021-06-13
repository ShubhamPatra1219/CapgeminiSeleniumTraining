package com.FirstJavaProgram;

public class Polymorphisim {
		
	//3 Parameters Data Type Floats
	public void multiply (float x,float y,float z)
	{
		System.out.println(x*y*z);
	}
	//3 Parameters Data Type int
	public void multiply (int a,int b,int c)
	{
        System.out.println(a*b*c);
	}
	//2 Parameters Data type Double
	public void multiply (double a,double b)
	{
        System.out.println(a*b);
	}
	//3 Parameters Data type Double
	public void multiply (double a,double b,double c)
	{
	        System.out.println(a*b*c);;
	}
	public static void main(String[] args) 
	{
		Polymorphisim pol = new Polymorphisim();
		pol.multiply(32.85f, 56.87f, 42.36f);
		pol.multiply(56, 78, 84);
		pol.multiply(46.57, 63.87);
		pol.multiply(587.45, 888.25, 987.41);
	}

}
