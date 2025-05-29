package javaProject;

public class UnaryOperator2 {

	public static void main(String[] args) {
		int a = 5;//Local Variable
		int b = 5;//Local Variable
		
		System.out.println(a++); //5,6
		System.out.println(a++ + ++a);//[6,7] [8,8] = 6+8=14
		System.out.println(b++ + b++);//[5,6] [6,7] = 5+6=11
		System.out.println(b); //7
		System.out.println(a++ + b++);// [8,9] [7,8] = 8+7=15

	}

}
