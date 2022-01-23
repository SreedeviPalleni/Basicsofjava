import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Employee1{
	String Emp_name;
	int Emp_id;
    float Emp_sal;
    char gen;
    int age;
    void input() throws IOException	{
    	InputStreamReader is=new InputStreamReader(System.in);
    	BufferedReader br=new BufferedReader(is);
    	System.out.println("Enetr Employee name");
    	Emp_name=br.readLine();
    	System.out.println("Enter Employee Id");
    	Emp_id=Integer.parseInt(br.readLine());
    	System.out.println("Enter gender");
		gen=br.readLine().charAt(0);
		System.out.println("Enter age");
		age=Integer.parseInt(br.readLine()); 
		
	}
    void display() {
    	System.out.println("Name=" +Emp_name);
    	System.out.println("EmP id" +Emp_id);
    	System.out.println("Gender" +gen);
    	System.out.println("age" +age);
    	
    	
    	
    	
    }
	
	
}
public class BufferandInputStream {

	public static void main(String[] args) throws IOException {
		
		Employee1 sob=new Employee1();
		Employee1 sob1=new Employee1();
		sob.input();
		sob.display();
		sob1.input();
		sob1.display();
		
		
	}

}
