
public class Main
{
	public static void main(String[] args)
	{
		int i,j;
		boolean prime = true;

		for (i = 2; i <= 100; i++)
		{
			for (j = 2; j <= i/2; j++)
			{
				if (i % j == 0)
				{
					prime = false;
					break ;
				}
				else
					prime = true;
			}
			if (prime)
				System.out.print(i + " ");
		}
	}
}
