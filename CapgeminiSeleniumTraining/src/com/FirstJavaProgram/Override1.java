package com.FirstJavaProgram;

	class ParentClass {
		public void sum() {
			System.out.println("The Sum of two numbers");
		}
	}
	class ChildClass extends ParentClass {
		@Override
		public void sum() {
			System.out.println("The Sum of three numbers");
		}
	}

public class Override1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParentClass p = new ParentClass();
		ChildClass c = new ChildClass();
		p.sum();
		c.sum();
	}

}
