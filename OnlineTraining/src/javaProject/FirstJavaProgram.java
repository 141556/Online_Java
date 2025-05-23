package javaProject;

public class FirstJavaProgram {
	int a = 5;// int type global variable
	static int e = 10;// Static variable

	//The above varaible will not get print since we have not called in main method to access these we need to create an object with class name inside main method we can call
	public static void main(String[] args) {
		FirstJavaProgram FJP = new FirstJavaProgram();//Creation of an object
		System.out.println(FJP.a);//to access the global variable 
		System.out.println(FJP.e);//to access the static variable
		System.out.println("Aswini");
		System.out.println("java");
		System.out.println("Automation");
		System.out.println("Training");
		aMethod();
		bMethod();
		int b =5 ;//int type local variable
		System.out.println(b);
		

	}

	public static void aMethod() {
		System.out.println("Hello a Method");
		int c = 6;//int type local variable
		System.out.println(c);
	}
	
	public static void bMethod() {
		System.out.println("Hellow b Method");
		int d = 7;
		System.out.println(d);
	}
}
