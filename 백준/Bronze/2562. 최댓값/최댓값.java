import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int arry[] = new int[9];
		int max = arry[0];
		int a = 0;
		
		for(int i = 0; i < arry.length; i++)
		{
			arry[i] = sc.nextInt();
			if(max < arry[i])
			{
				max = arry[i];
				a = i + 1;
			}
		}
		System.out.print(max + " " + a);
	}
}