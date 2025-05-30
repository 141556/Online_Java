package javaProject;

public class NestedIf {

	public static void main(String[] args) {
		int age = 25;
		int weight = 55;

		// Outer if statement
		if (age > 18) {
			if (weight > 50) {

				System.out.println("Eligible");
			}else {
				System.out.println("Not Eligible");
			}
		}
		else {
			System.out.println("Age is not greater than 18");
		}
	}

}
