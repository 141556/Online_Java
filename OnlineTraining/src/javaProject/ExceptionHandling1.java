package javaProject;

public class ExceptionHandling1 {

	public static void main(String[] args) {

		try {
			int a = 5 / 0;// java.lang.ArithmeticException
		} catch (ArithmeticException a) {

			a.printStackTrace();// Print complete exception info :It is only to check the exception
			System.out.println(a);// it will print exception only
		} catch (NullPointerException n) {

			n.printStackTrace();// Print complete exception info :It is only to check the exception
			System.out.println(n);// it will print exception only
		} catch (ArrayIndexOutOfBoundsException b) {

			b.printStackTrace();// Print complete exception info :It is only to check the exception
			System.out.println(b);// it will print exception only
		} catch (Exception e) {//The above all exception will check first if none of them are thrown at this stage if we get another exception then it will get capture
			e.printStackTrace();
			System.out.println(e);
		} // for single try block can have multiple catch blocks

		System.out.println("Hello");
	}

}
