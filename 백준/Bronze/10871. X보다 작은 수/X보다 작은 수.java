import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int[] A = new int[N];
		int X = sc.nextInt();
		
		for(int i = 0; i < A.length; i++)
		{
			A[i] = sc.nextInt();
			
			if(X > A[i])
			{
				System.out.print(A[i] + " ");
			}
		}
	}
}