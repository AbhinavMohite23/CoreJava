package Pattern;

public class pattern_45 
{
	public static void main(String args[])
	{
		int n=5;
		int x=1;
		
		
			for(int i=1 ;i<=5;i++)
			{
				for(int j=1;j<=i;j++)
				{
					System.out.printf("%3d",x);
					x+=2;
				}
				System.out.println();
			}
		
	}


}
