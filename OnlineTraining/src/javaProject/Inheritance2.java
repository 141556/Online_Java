package javaProject;

public class Inheritance2 extends Inheritance1{
	
	int b = 10;//Global variable

	public static void main(String[] args) {
		
		Inheritance2 i2 = new Inheritance2();
		System.out.println(i2.b);//10
		System.out.println(i2.roll);//5
		

	}

}
