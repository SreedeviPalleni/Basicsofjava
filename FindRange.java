package conditionalstmt;

import java.util.Scanner;

public class FindRange {

	public static void main(String[] args) {
		char grade;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter subject grade ");
		grade=scan.next().charAt(0);
		if(grade=='a' || grade=='A')
		{
			System.out.println(grade + "mark between 90-100");
		}
		else if(grade=='b' || grade=='B')
		{
			System.out.println(grade + " is mark between 60-89");
		}
		else if(grade=='c' || grade=='C')
		{
			System.out.println(grade + " is mark between 40-59");
		}
		else if(grade=='d'|| grade=='D')
		{
			System.out.println(grade + " is mark between 0-39");
		}
		else
		{
			System.out.println(grade + " invalid");
		}
				
			}
		}

	


