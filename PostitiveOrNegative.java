package conditionalstmt;

import java.util.Scanner;

public class PostitiveOrNegative {

	public static void main(String[] args) 
	{
		int num;
		Scanner obj=new Scanner (System.in);
		System.out.println("enter your num");
		num=obj.nextInt();
		if(num>=0)
		{
			System.out.println("num is positive");
		}
		else
		{
			System.out.println("num is negetive");
		}
	}

}
