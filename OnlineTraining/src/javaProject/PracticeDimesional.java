package javaProject;

public class PracticeDimesional {

	public static void main(String[] args) {
		int a[][] = {{1,2,3},{4,5,6},{7,8,9}};
		
		int row = a.length;
		int column = a[0].length;
		System.out.println(row);
		System.out.println(column);
		
		for (int i =0; i<a.length;i++) {
			for(int j = 0; j<a[0].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

	}

}
