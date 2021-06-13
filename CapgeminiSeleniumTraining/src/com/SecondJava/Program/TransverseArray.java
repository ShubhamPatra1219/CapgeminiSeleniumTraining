package com.SecondJava.Program;

public class TransverseArray {

	public static void main(String[] args) {
		int [] [] array = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println("Printing Actual Array Below:");
		for(int i=0;i<array.length;i++)
		{
			//System.out.println("The Row Count is: "+array[i].length);
			for (int j=0;j<array[i].length;j++)
				System.out.print(array[i][j]+",");
			System.out.println();
		}
		System.out.println("Printing Traversed Array Below:");
		for(int i=0;i<array.length;i++)
		{
			//System.out.println("The Row Count is: "+array[i].length);
			for (int j=0;j<array[i].length;j++)
				System.out.print(array[j][i]+",");
			System.out.println();
		}

	}

}
