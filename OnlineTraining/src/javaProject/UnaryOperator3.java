package javaProject;

public class UnaryOperator3 {

	public static void main(String[] args) {
		int a = 10;//Local Variable
		int b = 10;//Local Variable
		
		System.out.println(a++); //10,11
		System.out.println(a++ + ++a);//[11,12] [13,13] = 11+13=24
		System.out.println(a + a++);//13 [13,14] = 13+13 =26
		System.out.println(b++ + b--); //[10,11] [11,10] 10+11=21
		System.out.println(b-- + ++b);// [10,9] [10,10] = 10+10=20
		System.out.println(b);//10


	}

}
