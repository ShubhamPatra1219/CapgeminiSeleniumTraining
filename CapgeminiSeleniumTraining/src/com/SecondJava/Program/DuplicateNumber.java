package com.SecondJava.Program;

public class DuplicateNumber extends ArrayAscendingDescending 
{
	public void frequency(int [] x)
	{
		int n=x.length; int temp=0;
		//Sorting the array for make it easy
		for(int a=0;a<n;a++)
			for(int b=a+1;b<n;b++)
				if(x[a]>x[b])
				{
					temp = x[a];
					x[a]=x[b];
					x[b]=temp;
				}
		//Frequency Check Codes.
		int i,j;
		for(i=0;i<n;i++)
		{
			int count = 1;
			for(j=i+1;j<n;j++)
				if(x[i] == x[j])
				{
				  count++;
			      i=j;
				}
			System.out.println("The Frequency of "+x[i]+" is: "+count);
		}	
	}
	public static void main(String[] args) 
	{
		DuplicateNumber obj = new DuplicateNumber();
		obj.frequency(obj.getValues()); 
	}

}
