package javaProject;

public class Constructor3 {
	
	//Constructor Overloading
	Constructor3(){
		System.out.println("No parameter");
	}
	Constructor3(int a){
		System.out.println("Int parameter");
	}
	
	Constructor3(String b){
		System.out.println("String parameter");
	}

	public static void main(String[] args) {
		Constructor3 c1 = new Constructor3();//No parameter
		Constructor3 c2 = new Constructor3(14);//Int parameter
		Constructor3 c3 = new Constructor3("Aswini");//String parameter
		

	}

}
