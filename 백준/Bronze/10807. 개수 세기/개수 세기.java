import java.util.Scanner;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int cnt = 0;
		int N = sc.nextInt();
		int[] arry = new int[N];
		
		for(int i = 0; i < arry.length; i++)
		{
			arry[i] = sc.nextInt();
		}
		
		int v = sc.nextInt();
		
		for(int j = 0; j < arry.length; j++)
		{
			if(arry[j] == v)
			{
				cnt++;
			}
		}
		
		System.out.println(cnt);
	}
}