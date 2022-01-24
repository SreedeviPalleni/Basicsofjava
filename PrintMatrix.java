package arraysusingmatrix;

import java.util.Scanner;

public class PrintMatrix {

	public static void main(String[] args) {
		int  arr[][];
	    int row,col;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the total number of row : ");
		 row = scan.nextInt();
		 System.out.print("Enter the total number of column : ");
		col = scan.nextInt();
		arr=new int[row][col];
		
		for(int i=0;i<row;i++) {
	    for(int j=0;j<col;j++) { 
		System.out.print("Enter element for row = " + (i + 1) + " column = " + (j + 1) + " : ");
		arr[i][j]=scan.nextInt();
	    }
		}
		System.out.println();
		 for(int i=0;i<row;i++) {
		    	for(int j=0;j<col;j++) {
		    		
		    		System.out.print(  arr[i][j]+ " "  );
		    	}
		    	
		    	System.out.println();
		    }
	    for(int i=0;i<row;i++) {
	    	for(int j=0;j<col;j++) {
	    		
	    		System.out.print(  arr[i][j]+ " "  );
	    	}
	    	
	    	System.out.println();
	    }
	    
			
			
		}
		
		
	
}
	



