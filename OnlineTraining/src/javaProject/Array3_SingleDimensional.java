package javaProject;

public class Array3_SingleDimensional {
	static int c[] = {22,11,33,10};

	public static void main(String[] args) {
		int b = c[0];//22
		
		for (int i=0;i<c.length;i++) {
			if(b>c[i]) {
				System.out.println(b);
			}else {
				System.out.println("ABCD");
			}
				
		}
		
	}

}
