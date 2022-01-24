
public class ToCountNumAndAlpha {

	public static void main(String[] args) {
		String s="sree1234";
		int k=0,l=0;
		for(int i=0;i<s.length();i++)
		{
			char ch=s.charAt(i);
			if(ch>='0'&&ch<='9')
			{
				k++;
			}
			else {
				if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
				{
					l++;
				}
			}
		}
				if(k==0)
				{
					System.out.println("the string has no numeric");
				}
				else
				{
					System.out.println("the string  has" +k+   "numeric");
				}
				if(l==0)
				{
					System.out.println("the string has no alphabets");
				}
				else
				{
					System.out.println("the string has"  +l+   "alphabets");
				}
			}
		}
			

	


