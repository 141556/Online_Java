package JavaPrograms;

public class OddEvenNumbers {

	public static void main(String[] args) {
		int a[] = { 1, 4, 5, 7, 8 };
		int even = 0, odd = 0;

		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		}
		System.out.println(even);
		System.out.println(odd);

	}

}
