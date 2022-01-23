package sreedevi2;

import java.util.Scanner;

public class VowelOrConso {

	public static void main(String[] args)
	{
		char vowel, Consonent, Character;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the your character");
		Character= obj.next().charAt(0);
		switch(Character)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Caharacter is vowel ");
			break;
			default :
			
				System.out.println("Character is not vowel");
					
				
			}
			
		}
		
		
		

	}


