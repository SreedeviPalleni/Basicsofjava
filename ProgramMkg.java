
public class ProgramMkg {

	public static void main(String[] args) {

String s="Mahathma Karamchand Gandhi";
for(int i=0;i<s.length();i++){
//only for first char
	if(i==0) {
		System.out.print(s.charAt(i)+".");//for first
		}
	else if(s.charAt(i)==' ')
	System.out.print(s.charAt(i+1)+" .");
}

	}

}
