import java.util.Scanner;

public class PrrgmToCrede {

	public static void main(String[] args) {
		String username="Sreedevi123";
		String password="8179472941";
		String uname  ,upwd;
		
		Scanner sc=new Scanner(System.in);
		int count=0;
		System.out.println("Alert:You have 3 attempts to login");
		do {
		
		System.out.println("Enter username");
        uname=sc.nextLine();
		System.out.println("Enter password");
		upwd=sc.nextLine();
		
		if(username.equalsIgnoreCase(uname)&&password.equals(upwd))
		{
			System.out.println("login sucessful");
			break;
		
		 }
		else {
			System.out.println("invalid user");
			count++;
		}
		}while(count<3);//2
			
			if(count==3)
		{
			System.out.println("You have exceeded 3 attempts try after 24 hrs");
		}
		}
	}

		 
		
	

			
		
		
		
		

	

