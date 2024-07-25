import java.util.Scanner;

public class Main 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();

		for(int x = 1; x <= 9; x++)
		{
			for(int y = 1; y <= 9; y++)
			{
				if(N == x)
				{
					System.out.println(x + " * " + y + " = " + (x*y));
				}
			}
		}
	}
}