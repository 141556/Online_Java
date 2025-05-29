package javaProject;

public class Static5 {
	
	String a ;//Static Variable
	int b;//Global Variable
	static int c ;
	
	//Static method
	public static void a() {
		System.out.println("Hello Static");
	}
	

	public static void main(String[] args) {
		Static5 s5 = new Static5();
		s5.a = "Selenium";
		s5.b = 1;
		c = 2;
		a();//Hello Static
		System.out.println(s5.a);
		System.out.println(s5.b);
		System.out.println(c);
		

	}

}
