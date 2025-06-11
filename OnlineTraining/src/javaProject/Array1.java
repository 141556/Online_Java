package javaProject;

public class Array1 {

	public static void main(String[] args) {
		// Declaring an array
		int a[] = new int[5];

		System.out.println(a.length);

		// Print the default value of an array
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		// Assign the value of an array
		a[0] = 22;
		a[1] = 21;
		a[2] = 20;
		a[3] = 19;
		a[4] = 18;

		System.out.println(a[2]);// 20

		// Print all array elements
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);

		}

	}

}
