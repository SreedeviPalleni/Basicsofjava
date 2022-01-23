package conditionalstmt;

import java.util.Scanner;

public class GradingInMarks {

	public static void main(String[] args) {
		int  marks;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your marks ");
		marks=scan.nextInt();
		
		if(marks>=90&&marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>=60 && marks<=89)
		{
			System.out.println("Grade B");
		}
		
		else if(marks>=40 && marks<=50)
		{
			System.out.println("Grade c");
		}
		
			
		else if(marks>=0 && marks>=30)
		{
		
		System.out.println("Grade D");
		}
		else {
			System.out.println("other value");
		}
		
		}
			
			
		
			
		
}


