import java.util.Scanner;

class Employer{
	String name;
	String id;
	String dept;
	char gen;
	void input() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Employer name");
		name=scan.nextLine();
		System.out.println("Eneter Employer department");
		dept=scan.nextLine();
	  System.out.println("Enter Employer Id");
		id=scan.nextLine();
	 System.out.println("Enter Employer gen");
		gen=scan.next().charAt(0);
		
		}
	void display()
	{
		System.out.println("Name:" +name);
		System.out.println("ID:" +id);
		System.out.println("Department:" +dept);
		System.out.println("Gender:"+gen);
		
	}
	
}
public class EmployeeDetailsUsingArray {

	public static void main(String[] args) {
		Employer a[];
		Scanner sc=new Scanner(System.in);
		System.out.println("Eneter number of Employee");
		int sn=sc.nextInt();
		a=new Employer[sn];
			for(int i=0;i<a.length;i++)
			{
				a[i]=new Employer();
			}
			for(int i=0;i<a.length;i++)
			{
			 a[i].input();
			}
			for(int i=0;i<a.length;i++) {
				a[i].display();
			}
				
				
		
		

	}

}
