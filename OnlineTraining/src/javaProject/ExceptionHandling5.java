package javaProject;

public class ExceptionHandling5 {

	public static void main(String[] args) {
		try {
			int i = 10 / 0;
		} finally {
			System.out.println("Finally always will get execute");
		}

	}

}
