package sreedevi2;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) 
	{
		int num;
		Scanner sc=new Scanner(System.in);
		System.out.println("0 for even");
		System.out.println("1 is for odd");
		System.out.println("enter your number");
		num=sc.nextInt();
		
		switch(num%2)
		{
		case 1:
			System.out.println("odd");
			break;
		case 0:
			System.out.println("even");
		{
			
		}
			
		}
		
		

	}

}
