
public class String_Function2 {

	public static void main(String[] args) {
		String s="Hello Friends";
		//String s1=s.substring(3,6);
		//System.out.println(s1);
		System.out.println(s.substring(3,6));//include the starting exclude the ending index
        System.out.println(s.substring(6));
        System.out.println(s.substring(s.length()-1));//to print last character);
        System.out.println(s.charAt(s.length()-1));
        System.out.println(s.indexOf('r'));
        System.out.println(s.indexOf('z'));
        System.out.println(s.indexOf('e'));
        System.out.println(s.lastIndexOf('e'));
        System.out.println(s.contains("Hello"));// it will find whole string and give boolean value
	}
	
	

}
