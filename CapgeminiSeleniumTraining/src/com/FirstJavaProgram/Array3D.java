package com.FirstJavaProgram;

public class Array3D {

		public static void main(String[] args) {
		int [] [] [] a = //new int [2][2][2];
{
	              { {1,-2}, 
	                {2, 3}
	              }, 
	              { 
	                {-4, -5},  
	                {2, 3}
	              } 
	          };
		for(int[][] ele1:a)
			for(int[] ele2: ele1)
				for(int ele3:ele2)
			System.out.println(ele3);
		
	}

}
