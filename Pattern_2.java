package nestedloops;

import java.util.Scanner;

public class Pattern_2 {

	public static void main(String[] args) {
		int i,j,size;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enetr the rows");
		size=sc.nextInt();
		for(i=size;i>=1;i--)
		{
			for(j=i;j>=1;j--)
			{
				System.out.print(j+" ");
			
		}
			System.out.println();
		
	}

}
}
