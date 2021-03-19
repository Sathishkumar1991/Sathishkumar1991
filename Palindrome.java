package week1.day1;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		String rev="";
		 
		char[] chr=str.toCharArray();
		for(int i=chr.length-1;i>=0;i--)
		{
		rev=rev+chr[i];
		}
		if(str.equalsIgnoreCase(rev))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("not a palindrome");

	}
	}

}
