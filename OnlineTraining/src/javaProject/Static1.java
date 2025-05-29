package javaProject;

public class Static1 {
	int x =500;//Global Variable
	String s ="Hello";//Global Variable
	static int y = 100;//Static variable
	
	//Static method
	public static void method1() {
		String x = "Hi";//Local variable
		System.out.println(x);//calling x variable
	}
	
	//Non Static method
	public void method2() {
		int i = 100;
	}
	
//Conclusion: Here we don't have main method so we will not be able to execute
	
}
