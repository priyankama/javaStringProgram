import java.io.*;
class Strpalindrome{
	public static void main(String args[]){
		Console con=System.console();
		con.printf("Enter any string :");
		String str=con.readLine();
		int len=str.length();
		char ch[]=str.toCharArray();
		char ch1[]=new char[100];
		int c=0;
		for(int i=len-1;i>=0;i--)
			{
				ch1[c]=ch[i];		
				++c;
			}
		String str1=String.copyValueOf(ch1);
		if(str.equalsIgnoreCase(str1))
			System.out.print("Palindrome string "+str1);
		else
			con.printf("Not a palindrome string "+str1);
	}
}