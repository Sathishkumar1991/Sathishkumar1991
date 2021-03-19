package week1.day1;

public class Reverseanevenword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test="i am a software";
		String[]split=test.split(" ");

		for(int i=0;i<split.length;i++)
		{
			if(i%2==0)
			{
				
		
				{
					
					System.out.println(split[i]);
				}
			}
			
			if(i%2==1)
			
				{
				String rev=split[i];
				
				char[]reve=rev.toCharArray();
				for(int j=reve.length-1;j>=0;j--)
					
						
					System.out.println(reve[j]);
				}
			}
	}

}
