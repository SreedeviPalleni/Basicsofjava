import java.util.Scanner;

class Employee{
	String Emp_name;
	int Emp_id;
    float Emp_sal;
    void input() {
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter name");
    Emp_name=scan.nextLine();
    System.out.println("Enter id");
	Emp_id=scan.nextInt();
	System.out.println("Enter salary");
	Emp_sal=scan.nextFloat();
    }
    
    void display() {
    	System.out.println("Name= " +Emp_name );
    	System.out.println("Id= " +Emp_id );
    	System.out.println("Salary= " +Emp_sal );
    }
	
		
}
public class EmpDetails {

	public static void main(String[] args) {
		Employee sob=new Employee();
		Employee sob1=new Employee();
		sob.input();
		sob.display();
		sob1.input();
		sob1.display();
		
	}
}
		
		
		
		
		

	


