import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N; i++)
		{
			String s = sc.next();
			char sd1 = s.charAt(0);
			char sd2 = s.charAt(s.length()-1);
			
			System.out.print(sd1);
			System.out.println(sd2);
		}
	}
}
