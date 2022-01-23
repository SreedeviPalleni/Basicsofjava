package sreedevi2;

import java.util.Scanner;

public class DidplayArith {

	public static void main(String[] args) {
		int choice  ;
		float num1, num2, answer;
		Scanner sc=new Scanner(System.in);
		System.out.println("1 is addition");
		System.out.println("2 is Substraction");
		System.out.println("3 is multipliaction");
		System.out.println("4 is division");
		System.out.println("Enter your Choice");
		choice=sc.nextInt();
		System.out.println("Enter first numbers");
		num1=sc.nextFloat();
		System.out.println("Enter second number");
		num2=sc.nextFloat();
		switch(choice)
		{
		case 1 :
			answer=num1+num2;
			System.out.println("addition is" +answer);
			break;
		case 2 :
		answer=num1-num2;
		System.out.println("substraction is" +answer);
		break;
		case 3 :
		answer= num1*num2;
		System.out.println("multiplication is" +answer);
		break;
		case 4 :
			answer=num1/num2;
			System.out.println("division is" +answer);
			break;
			default:
			{
				System.out.println("Enter choice is invalid");
			}
		}
	}
}



