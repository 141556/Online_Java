package javaProject;

public class ExceptionHandling6 {

	public static void main(String[] args) {
		
			try {
				int i = 10 / 0;
			} catch (Exception e) {
				e.printStackTrace();
			}finally {
				System.out.println("Finally will alaways get execute");
			}
		 

	}

}
