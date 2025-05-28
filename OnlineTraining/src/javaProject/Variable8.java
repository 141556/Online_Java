package javaProject;

public class Variable8 {
	
	int a = 5;//Global variable
	static int b = 4;//Static variable
	
	//Static method
	
	public static void d() {
		int c =6;
		System.out.println(c);//6- when you call the method inside main method
	}
	
	//Non Static method
	
	public void f() {
		int d = 8;//local variable
		System.out.println(d);//8-when you call the method inside main method
	}

	public static void main(String[] args) {
		int e =10;
		System.out.println(e);//10
		
		//Static member calling - static members we can call directly inside main method
		System.out.println(b);//4
		d();
		
		//Non static member calling - Need create an object
		//Syntax : ClassName ref = new ClassName();
		
		Variable8 v8 = new Variable8();
		System.out.println(v8.a);//5 - calling non static variable using class ref
		v8.f();//8m- calling non static method using class ref
		
		

	}

}
