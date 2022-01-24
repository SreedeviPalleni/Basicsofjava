package nestedloops;

import java.util.Scanner;

public class RiversPattern {

	public static void main(String[] args) 
	{
		int i,j,num;
		int count=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the num");
		num=scan.nextInt();
		for(i=num;i<=num;i--)//5;
		{
			for(j=num;j<=i;j--)
			{
				System.out.print("--Count+");
			}
			System.out.println();
		}
		
		

	}

}
