package javaProject;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		String s = "Selenium";
		try {
			int i = Integer.parseInt(s);
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		System.out.println("Exception handling");

	}

}
