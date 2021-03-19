package week1.day1;

public class Removeduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="We learn java basicsas part of java session in java week1";

		String[] str1=str.split(" ");
		for(int i=0;i<str1.length;i++)
		{

		int count=0;
			for(int j=0;j<str1.length;j++)
			{
				if(str1[i].equalsIgnoreCase(str1[j]))
				
					count=count+1;
					
			}
				if(count>1)
				{
					str1[i]=" ";
				
					
				}
				System.out.println(str1[i]+" ");
			}
	}

}
