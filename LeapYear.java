package sreedevi2;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) 
	{
		int year;
		
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter your year");
		year= obj.nextInt();
		
		if(year % 4==0)
		{
			System.out.println("enter year is Leap year);");
		}
		else
		{ 
			System.out.println("Enter is not leap year");
		}

	}

}
