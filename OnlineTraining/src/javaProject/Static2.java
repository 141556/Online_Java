package javaProject;

public class Static2 {
	
	
int roll;//Global variable
String name ;//Global variable
static String college = "SPMVV";

//Constructor
Static2(int r , String n){
	roll = r;
	name = n;
}

public void getResults() {
	System.out.println(roll + " " + name + " " + college);
}

	public static void main(String[] args) {
		
		Static2 s2 = new Static2(1 , "Aswini");
		Static2 s3 = new Static2(2 , "Jangala");
		Static2 s4 = new Static2(3 , "JA");
		
		s2.getResults();
		s3.getResults();
		s4.getResults();

	}

}
