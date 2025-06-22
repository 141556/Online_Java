package javaProject;

public class Constructor2 {
	int id;// Global Variable
	String name;// Global Variable
	String address;// Global variable

//Default constructor
	Constructor2() {
		System.out.println("Hello defualt constructor");

	}
	
	//Interview question : If we have any return type for the constructor what will be the output
String Constructor2() {//it is no more as a constructor  it is a method
	return name;

}
	// Parameterized constructor
	Constructor2(int a, String b, String c) {
		id = a;
		name = b;
		address = c;
	}
	Constructor2(int a, String b) {
		id = a;
		name = b;
		
	}

	public void displayInfo() {
		System.out.println(id + " " + name + " " + address);
	}

	public static void main(String[] args) {
		// Default constructor
		Constructor2 c2 = new Constructor2();
		// Parameterized constructor
		Constructor2 c3 = new Constructor2(1, "John", "UK");
		c3.displayInfo();
		Constructor2 c4 = new Constructor2(1, "James", "US");
		c4.displayInfo();
		
		//Interview ans
		Constructor2 c5 = new Constructor2(1,"James"," ");
		String result = c5.Constructor2();
		System.out.println("Returned value: "+ result);
		
		

	}

}
