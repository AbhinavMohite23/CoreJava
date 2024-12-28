package Pattern;

public class Pattern_44 
{
	public static void main(String args[])
	{
		int i;
		int j;
		int k=0;
		int n=4;
		
			for(i=1 ;i<=n;i++)
			{
				k+=i;
				for(j=k;j>k-i;j--)
				{
					System.out.printf("%2d",j);
					
				}
				System.out.println();
			}
		
	}


}
