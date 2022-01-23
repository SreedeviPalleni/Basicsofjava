package conditionalstmt;

import java.util.Scanner;

public class LargestTwoNum {

	public static void main(String[] args) 
	{
		int num1, num2;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first num ");
		num1=scan.nextInt();
		System.out.println("Enter your second num");
		num2=scan.nextInt();
		if(num1>num2)
		{
			System.out.println("num1 is largest");
		}
			else if(num2>num1)
			{
				System.out.println("num2 is largest");
			}
				else
				{
					System.out.println("both numbers are equal");
				}
	}
}

				
			
		
				

	
		
	
	


