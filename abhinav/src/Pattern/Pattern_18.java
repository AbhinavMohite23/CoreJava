package Pattern;

public class Pattern_18 
{
	public static void main(String args[])
	{
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.printf("%3d", (i+j)%2);
				
			}
			System.out.println();
		}
	}

	


	

}
