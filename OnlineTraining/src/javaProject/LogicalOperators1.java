package javaProject;

public class LogicalOperators1 {

	public static void main(String[] args) {
		int a = 10;
		int b = 5;
		int c = 20;
		
		//Logical Operator - if first condition is false then the rest of the conditions will not get checked
		System.out.println(a<b && a<c);//false
		
		//Bitwise Operator - it will check all the conditions
		System.out.println(a<b & a<c);//false
	}

}
