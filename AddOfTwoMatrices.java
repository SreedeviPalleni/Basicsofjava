package arraysusingmatrix;

import java.util.Scanner;

public class AddOfTwoMatrices {

	public static void main(String[] args) {
		int a[][],b[][],c[][];
		int row, col,row1 = 0,col1=0;
		int i,j;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the total number of row : ");
		 row = scan.nextInt();
		 System.out.print("Enter the total number of column : ");
		col = scan.nextInt();
		a=new int[row][col];
		b=new int[row][col];
		c=new int[row][col];
		System.out.println("Enter all the element in first matrix");
		for( i=0;i<row;i++) {
	    for( j=0;j<col;j++) { 
	    	a[i][j]=scan.nextInt();
	    }
		}
		System.out.println("The first matrix is");
		 for( i=0;i<row;i++) {
		 for( j=0;j<col;j++) {
		    System.out.print(  a[i][j]+ " "  );
		    	}
		 System.out.println();
		System.out.println("Enter all the elements in second matrix");
		for( i=0;i<row;i++) {
	    for( j=0;j<col;j++) { 
		
		b[i][j]=scan.nextInt();
	    }
		}
		System.out.println("The second matrix is");
		 for( i=0;i<row;i++) {
		    	for( j=0;j<col;j++) {
		    		
		    		System.out.print(  b[i][j]+ " "  );
		    	}
		    	
		    	System.out.println();
	}
		 c[i][j]=scan.nextInt();
	      System.out.println("Sum of two matrix is");
		 for( i=0;i<row;i++) {
		    	for( j=0;j<col;j++) {
		    		 c[i][j]=a[i][j]+b[i][j];
		    		System.out.println(c[i][j]);
		    	}
       System.out.println("After sum both the matrix :");
		 }
		 System.out.println(c[i][j]);
	}
}
}

