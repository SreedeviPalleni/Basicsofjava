
public class Numeric2 {

	public static void main(String[] args) {
		String s="12345";
		boolean flag=false;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9') {
				flag=true;
		}
	}
	if(flag==true) {
		System.out.println("Contains only digits");
		}
	else {
		System.out.println("Contains no digits");
	}
	}

}
