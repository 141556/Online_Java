package javaProject;

public class UnaryOperator1 {

	public static void main(String[] args) {
		int a =1;
		
		System.out.println(a);//1
		System.out.println(a++);//1
		System.out.println(a);//2
		System.out.println(a++);//2,3
		System.out.println(++a);//4,4
		System.out.println(a--);//4,3
		System.out.println(a);//3
		System.out.println(--a);//2,2

	}

}
