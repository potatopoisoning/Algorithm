import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		A[0] = sc.nextInt();
		
		int max = A[0];
		int min = A[0];
		
		for(int i = 1; i < A.length; i++)
		{
			A[i] = sc.nextInt();
			
			if(max < A[i])
			{
				max = A[i];
			}
			if(min > A[i])
			{
				min = A[i];
			}
		}
		System.out.print(min + " " + max);
	}
}
