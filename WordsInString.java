import java.util.Scanner;

public class WordsInString {
public static void main(String[] args) {
	String s="hello how are you";
	int count=1;
	for(int i=0;i<s.length();i++)
{
	if(s.charAt(i)==' ')  {
		count++;
		}
	}
System.out.println("The number of words in String" +count);
	}

}
