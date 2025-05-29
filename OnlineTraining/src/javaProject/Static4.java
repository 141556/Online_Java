package javaProject;

public class Static4 {
	
	int x = 10;//Global Variable
	static int y = 5;//Static variable
	
	
	//Non static method
	public void a() {
		int z = 10;//Local Variable
		System.out.println(z);//10
		
	}
	
	static int b = 6;//Global Variable
	
	//Static method 
	public static void b() {
		int a = 5;//Local Variable
		System.out.println(a);//5
	}
	
	public static void main(String[] args) {
		Static4 s4 = new Static4();
		s4.a();
		System.out.println(s4.b);//6 - not an appropriate way
		System.out.println(b);//6 -Correct way
		System.out.println(Static3.z);//5- Correct way for another class static member calling
		b();//5
		System.out.println(s4.x);
		System.out.println(y);
		
		

	}

}
