package javaProject;

public class Static3 {
	static int z = 5;//Static variable
	int y = 1;//Global Variable
	
	//Static method
	public static void a() {
		z=10;//Modification of the static variable value
		System.out.println(z);//10
		
		
		
	}
	//Non Static method
	public void b() {
		z= 15;
		System.out.println(z);//15
	}
	
	public static void main(String[] args) {
		System.out.println(z);//15
		a();//10
		Static3 s3 = new Static3();
		s3.b();
	}

}
