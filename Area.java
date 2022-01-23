package sreedevi2;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) {
	     double  a ;
	     int choice;
	     Scanner scan=new Scanner(System.in);
	     System.out.println("1 is for square");
		 System.out.println("2 is for rectangle");
		 System.out.println("3 is for tringle");
		 System.out.println("4 is for circle");
		 System.out.println("Enter your choice");
	     choice=scan.nextInt();
		switch(choice)
		{
		case 1 :
			double side;
			System.out.println("Enter the side of the square");
			side=scan.nextDouble();
			a=side*side;
			System.out.println("Area of square is" +a);
			break;
		case 2:
			double length, width ;
			System.out.println("Enter length and width of the rectangle");
			length=scan.nextDouble();
			width=scan.nextDouble();
			a=length*width;
			System.out.println("Area od Rectangle is" +a);
			break;
		case 3:
			double base, height;
			System.out.println("Enter base and height of the triangle");
			base=scan.nextDouble();
			height=scan.nextDouble();
			a=base*height;
			System.out.println("Area of Triangle is " +a); 
			break;
		case 4:
			
			double radius;
			double pi=3.14;
			System.out.println("Enter radius of the circle");
			radius=scan.nextDouble();
			a=pi*radius*radius;
			System.out.println("Area of circle is" +a);
			break;
				
			
	
			
			
			
			
			
		}
		
		
		
		

	}

}
