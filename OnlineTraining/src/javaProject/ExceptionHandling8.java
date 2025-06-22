package javaProject;

public class ExceptionHandling8 {

	public static void a(int age) throws ExceptionHandling_CustomException {

		try {
			if (age < 18) {
				throw new ExceptionHandling_CustomException("Age is less than 18,Not Eligible");

			} else {
				System.out.println("Eligible");
			}
		} catch (ExceptionHandling_CustomException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws ExceptionHandling_CustomException {
		a(15);
		a(25);
		a(10);

	}

}
