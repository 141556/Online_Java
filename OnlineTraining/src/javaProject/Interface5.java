package javaProject;

public class Interface5 extends Inheritance1 implements Interface3, Interface4 {

	@Override
	public void a() {

		System.out.println("a method");
	}

	@Override
	public void b() {
		System.out.println("b method");
	}
	
	public static void main(String[] args) {
		Interface5 i5 = new Interface5();
		i5.a();
		i5.b();
		System.out.println(i5.roll);
	}

}
