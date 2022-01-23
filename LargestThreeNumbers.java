package conditionalstmt;

import java.util.Scanner;

public class LargestThreeNumbers {

	public static void main(String[] args) {
		int num1, num2, num3;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first num ");
		num1=scan.nextInt();
		System.out.println("Enter your second num");
		num2=scan.nextInt();
		System.out.println("Enter your third  num");
		num3=scan.nextInt();
		if(num1>num2&&num1>num3)
		{
			System.out.println("num1 is largest");
		}
		
			else if(num2>num1&&num2>num3)
			{
				System.out.println("num2 is largest");
			}
			
				
				else if(num3>num1&&num3>num2) 
				{
					System.out.println("num3 is largest");
				}
				else {
					System.out.println("three numbers are equal");
				}
					
					
				}
			}


		

	


