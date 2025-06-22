package javaProject;

public class TypeCastingNarrowing {

	public static void main(String[] args) {
		//Double to int conversion
		double d = 10.9;
		int a = (int)d;
		System.out.println(d);//10.9
		System.out.println(a);//10
		
		//String to int conversion
		String s = "10";
		int i = Integer.parseInt(s);
		System.out.println(i);
		
		//int to string conversion
		int z = 5;
		String t = String.valueOf(z);
		System.out.println(t.length());//1
		System.out.println(t);//5

	}

}
