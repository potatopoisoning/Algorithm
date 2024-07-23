import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m < 45)
		{
			if(h == 0)
			{
				System.out.println(h + 23);
			}else
			{
				System.out.println(h - 1);
			}
			System.out.println(m + 15);
		}else
		{
			System.out.println(h);
			System.out.println(m - 45);
		}
	}
}