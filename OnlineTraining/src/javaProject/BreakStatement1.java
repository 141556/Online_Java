package javaProject;

public class BreakStatement1 {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Control came out from the loop");

	}

}
