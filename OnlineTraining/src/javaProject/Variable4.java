package javaProject;

public class Variable4 {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };// Int type of array
		String s[] = { "John", "Peter" };// String tyoe of arrray

		Object c[] = { 1, 2, 3, 4, 5, "John", "Peter", 'a', 3 > 12, 10.4 };
 System.out.println(a[0]);//1
 System.out.println(a[1]);//2
 System.out.println(a[2]);//3
 System.out.println(a[3]);//4
 System.out.println(a[4]);//5
 
 
 System.out.println(s[0]);//John
 System.out.println(s[1]);//Peter
 
 System.out.println(c[0]);//1
 System.out.println(c[1]);//2
 System.out.println(c[2]);//3
 System.out.println(c[3]);//4
 System.out.println(c[4]);//5
 System.out.println(c[5]);//John
 System.out.println(c[6]);//Peter
 System.out.println(c[7]);//a
 System.out.println(c[8]);//false
 System.out.println(c[9]);//10.4
 
	}

}
