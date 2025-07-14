package JavaPrograms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {

		// Method 1
		String str = "Aswini";
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.print(str.charAt(i));
		}
		// Method 2 Using StringBuilder and scanner class
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to reverse:");
		String str1 = sc.nextLine();

		StringBuilder sb = new StringBuilder();
		sb.append(str1);
		sb.reverse();
		System.out.println(sb);
	}

}
