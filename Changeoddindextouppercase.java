package week1.day1;

public class Changeoddindextouppercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str= "Textleaf";
		String str1=str.toUpperCase();
	
		char[]chrarr=str.toCharArray();
		char[]chrarr1=str1.toCharArray();
		
		
		
		for(int i=0;i<chrarr.length;i++)
		{
		
			
			if(i%2==0)
			{
			System.out.println(chrarr1[i]);
			}
			else
			{
				System.out.println(chrarr[i]);
			}
		}

	}

}
