package javaProject;

public class Variable2 {

	Byte b;// Null- since it is non primitive type whatever it will be in upper case
	Character c;
	Short s;
	Integer i;
	Float f;
	Long l;
	Double d;
	Boolean bo;

	AbstractMethodError ab;//These all are and above are inbuilt/Predefined classes refer the JRE System library
	
//	AbstractStringBuilder Builder;//It is not accessible because it is private class

	public static void main(String[] args) {
		String s = "Hello Java";

		System.out.println(s);// To print string
		System.out.println("The length of the string:" + s.length());// To print length of the string

		String s1 = "    ";

		System.out.println(s1.length());//To print Length

		Variable2 v2 = new Variable2();
		System.out.println(v2.b);
		System.out.println(v2.c);
		System.out.println(v2.s);
		System.out.println(v2.i);
		System.out.println(v2.f);
		System.out.println(v2.l);
		System.out.println(v2.d);
		System.out.println(v2.bo);
		System.out.println(v2.ab);
		

	}

}
