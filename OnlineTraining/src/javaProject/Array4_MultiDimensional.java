package javaProject;

public class Array4_MultiDimensional {

	public static void main(String[] args) {
		//Defining multi dimensional array
		int a[][] = {{1,2,3,4}, {5,6,7,8},{9,10,11,12}};
		//Total number of rows
		int row = a.length;//length is the property of an array
		System.out.println(row);
		
		//Total number of columns
		int column = a[0].length;
		System.out.println(column);
		//Print all values in matrix form
		
		//Method 1
		//Outer loop -using length
		for(int i =0 ; i<a.length; i++) {
			//Inner loop
			for(int j =0; j<a[0].length;j++) {
				System.out.print(a[i][j]+ "  ");
			}
			System.out.println();
		}
		
		//Method2
		//Outer loop -using row and column values
				for(int i =0 ; i<row; i++) {
					//Inner loop
					for(int j =0; j<column;j++) {
						System.out.print(a[i][j]+ "  ");
					}
					System.out.println();
				}
		
		
		
	}

}
