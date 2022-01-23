package conditionalstmt;

import java.util.Scanner;

public class LargestOfFourNumber {

	public static void main(String[] args) {
		int i, j, k, l;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the four numbers");
		i=scan.nextInt();
		j=scan.nextInt();
		k=scan.nextInt();
		l=scan.nextInt();
		if(i>j&&i>k&&i>l)
		{
			System.out.println("1st number" +i+ "is largest num");
					
		}
		else if(j>i&&j>k&&j>l)
		{
			System.out.println("2nd number" +j+ "is the largest num" );
		}
		else if(k>i&&k>j&&k>l)
		{
			System.out.println("3rd number"+k+" is the largest num" );
		}
		else if(k>i&&l>j&&l>k)
		{
			System.out.println("4th number" +l+ "is the largest num");
		}
		
		
	}

}
