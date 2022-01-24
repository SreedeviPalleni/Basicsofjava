package nestedloops;

import java.util.Scanner;

public class TriPattern {

	public static void main(String[] args) {
		int i,j,k, num;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enetr values for i");
		i=scan.nextInt();
		System.out.println("Enetr values for j");
		num=scan.nextInt();
		for(i=1;i<=num;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			
			System.out.println();	
			
		}

	}

}
