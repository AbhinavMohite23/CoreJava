package Pattern;

public class pattern_53 
{

	public static void main(String args[])
	{
		int n=5;
	    int px;
			for(int i=1 ;i<=n;i++)
			{
				px=1;
				
				for(int j=1;j<=i;j++)
				{
					System.out.printf("%3d",px);
					px=px*(i-j)/j;
				}
				System.out.println();
			}
		
	}





}
