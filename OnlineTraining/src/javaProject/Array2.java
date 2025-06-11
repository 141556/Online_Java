package javaProject;

public class Array2 {

	public static void main(String[] args) {
		
		//We can write array in below fashion as well
		int b[] = {1,2,3,4,5};//5
		String s[] = {"Hi", "Hello"};//2
		Object a[] = {1,2,3,4,5, "Selenium",6,6.5};//8
		System.out.println(a.length);//8
		System.out.println(s.length);//2
		System.out.println(b.length);//5
		
		System.out.println(a[5]);
		System.out.println(b[4]);
		System.out.println(s[1]);
		
		a[5]= "Automation";//modifying an array value using index
		System.out.println(a[5]);//Automation
	}

}
