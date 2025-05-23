package javaProject;

public class Variable1 {

	public static void main(String[] args) {
		int a = 5;
		System.out.println(a);//5

		int x = 100;
		System.out.println(x);//100

		x = 200;// reinitialization -if we want to change the variable value we no need to
				// define datatype again
		System.out.println(x);//200

		char c = 'A';
		System.out.println(c);//A

		boolean b = true;
		System.out.println(b);//true

		b = false;
		System.out.println(b);//false

		System.out.println(3 > 12);//false

		int e = 13;
		int f = 18;

//		System.out.println(e > f);//false

		boolean z = e > f;

		System.out.println(z);//false

	}

}
