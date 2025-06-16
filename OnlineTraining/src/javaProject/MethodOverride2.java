package javaProject;

public class MethodOverride2 extends MethodOverride1{
	
	public void run() {
		System.out.println("you are running");	
		}

	public static void main(String[] args) {
		
		MethodOverride2 mo2 = new MethodOverride2();
		mo2.run();
	}

}
