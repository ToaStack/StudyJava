package com.gleidson.study;

/*
 Important points:
 
- The body of a lambda expression can contain zero, one or more statements.
- When there is a single statement curly brackets are not mandatory and the 
return type of the anonymous function is the same as that of the body expression.
- When there are more than one statements, then these must be enclosed in curly 
brackets (a code block) and the return type of the anonymous function is the same 
as the type of the value returned within the code block, or void if nothing is returned.
 */

public class LambdaTest {
	interface FuncInter1 {
		int operation(int a, int b);
	}
	
	interface FuncInter2 {
		void sayMessage(String message);
	}
	
	interface FuncInter3 {
		void text(String s);
	}
	
	private int operate(int a, int b, FuncInter1 fobj) {
		return fobj.operation(a, b);
	}
	
	public static void main(String[] args) {
		
		FuncInter1 add = (int a, int b) -> a+b;
		FuncInter1 multiply = (int a, int b) -> a*b;
		FuncInter1 divide = (int a, int b) -> a/b;
		
		FuncInter2 text = message -> System.out.println("Hello " + message);
		
		LambdaTest obj = new LambdaTest();
		
		System.out.println("Addition is " + obj.operate(6, 3, add));
		System.out.println("Multiplication is " + obj.operate(2, 3, multiply));
		System.out.println("Division is: " + obj.operate(2, 2, divide));
		
		text.sayMessage("Gleidson!");
			
	}
}
