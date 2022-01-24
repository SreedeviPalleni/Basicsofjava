
public class CheckAlphNum {

	public static void main(String[] args) {
		String s="12Hel13004";
		//ASCII A-Z:65 TO 90
		//a-z=97 to 122
		//0-9
		//int i='A'+1;
		/*char ch='A'+1;
		System.out.println("i="+i);
		for (i=65;i<=90;i++){
			char ch=(char)i;
			System.out.println("Ascii=" +i " char=" +ch);
			
		}*/
		boolean flag=true;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch>='0'&& ch<='9')) {
				flag=false;
					}
		}
			       System.out.println("the string contains numeric");
			       else
			       {
			    	   System.out.println("the string contains non numeric");
			       }
			
		
			
		}
	}


