package sreedevi2;

import java.util.Scanner;

public class StringSwith {

	public static void main(String[] args) {
		String course ;
		Scanner scc=new Scanner(System.in);
		System.out.println("*************MENU********");
		System.out.println("Java");
        System.out.println("Python");
        System.out.println("aws");
        System.out.println("Cloud");
		System.out.println("enter which course you want to join");
		course=scc.nextLine();
		
             switch(course)
             {
             case "java" :
             System.out.println( " Your Course is java");
             break;
             case "Python" :
            	 System.out.println( "Your Course is pyton");
            	 break;
             case "aws" :
            	 System.out.println("Your Course is aws");
            	 break;
             case "Cloud" :
            	 System.out.println("Your Course is Cloud");
            	 break;
            	 default :
            		 System.out.println("Entered course is invalid");
            	 
             }
             
             

	}

}
