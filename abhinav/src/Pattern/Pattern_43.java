package Pattern;

public class Pattern_43 
{
	public static void main(String args[])
	{
		int i;
		int j;
		
		
			for(i=1 ;i<=5;i++)
			{
				int t=i-1;
				for(j=1;j<=i;j++)
				{
					System.out.print((t+i));
					t+=2;
					
				}
				System.out.println();
			}
		
	}


}
