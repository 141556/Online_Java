package javaProject;

public class ReverseString {

	public static void main(String[] args) {

		// using for loop
		String original = "Aswini";
		String reversed = "";
		for (int i = original.length() - 1; i >= 0; i--) {
			reversed += original.charAt(i);
		}
		System.out.println("Reversed String: " + reversed);

        //Using StringBuilder
		String original1 = "ASWINI";
		String reversed1 = new StringBuilder(original1).reverse().toString();
		System.out.println("Reversed String: " + reversed1);

	}

}
