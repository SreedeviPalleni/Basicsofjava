package nestedloops;

import java.util.Scanner;

public class SumofSeries {

	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		int a,n,i;
		double s=0.0, x;
		System.out.println("enetr n valve=" );
		n=obj.nextInt();
		System.out.println("enter a value=");
		a=obj.nextInt();
		
		for(i=1;i<=n;i++)
		{
			x=a/(double)(i+1);
			s+=x;
			
		}
		System.out.println("Sum of the series is: "+s);
			
		}


}
