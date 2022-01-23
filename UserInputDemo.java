package sreedevi2;

import java.util.Scanner;




public class UserInputDemo {

	public static void main(String[] args) {
		int age;
		String name;	
		char gender;
		float fees;
		
		Scanner scan= new Scanner(System.in);
		System.out.println("enter your age");
		age=scan.nextInt();
		
		
	   System.out.println("enter your name");
	   name=scan.nextLine();
	   name=scan.nextLine();
	    
	    System.out.println("enter your gender");
	    gender=scan.next().charAt(0);
	    
	    System.out.println("enter your fees");
	    fees=scan.nextFloat();
	    
	    
	    
	    System.out.println("age is" +age);
	    System.out.println("name is" +name);
	    System.out.println("gender is" +gender);
	    System.out.println("fees is" +fees);
	    
	    
	    
	    
				
				
				
		
		
		
		
		
		
		
	}

}
