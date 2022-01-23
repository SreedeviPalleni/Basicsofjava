package sreedevi2;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) 
	{
		
		float maths, english,physics, chemistry, Sceinces, avg, total, marks;
		
		Scanner sub=new Scanner(System.in);
		System.out.println("Enter Maths Subject marks");
		maths=sub.nextFloat();
		System.out.println("Enter chemistry Subject marks");
		chemistry=sub.nextFloat();
		System.out.println("Enter english Subject marks");
		english=sub.nextFloat();
		
	   System.out.println("Enter Sceinces  Subject marks");
		Sceinces=sub.nextFloat();
		System.out.println("Enter physics Subject marks");
		physics=sub.nextFloat();
	   total=maths+chemistry+Sceinces+physics+english;
       avg=(total/5);
       System.out.println("total marks" +total);
       System.out.println("average marks" +avg);
      
       


	}

}
