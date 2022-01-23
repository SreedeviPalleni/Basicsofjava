package conditionalstmt;

import java.util.Scanner;

public class ElectricityBill {

	public static void main(String[] args)
	{
		int units;
		float amount;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the units");
		units=scan.nextInt();
		if(units<100)
		{
			amount=units*0.80f;
		}
			else if(units>=100 && units<=300)
			{
				amount=100*0.80f+(units-100)*1;
			}
			else
		{
				amount=100*0.80f+200*1+(units-300)*2.50f;
			
			}
		
		System.out.println("the amount to pay per  "+units+ "is " +amount);
			
		}
		
		
		
				
		

	}


