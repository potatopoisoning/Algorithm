import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 int n = sc.nextInt();
		 int m = sc.nextInt();
		 int[] arry = new int[n];
		 int N = 0;
		 
		 for(int i = 0; i < arry.length; i++)
		 {
			 arry[i] = i + 1;
		 }
		 for(int i = 0; i < m; i++)
		 {
			 int a = sc.nextInt() - 1;
			 int b = sc.nextInt() - 1;
			 
			 while(a<b)
			 {
				 N = arry[a];
				 arry[a] = arry[b];
				 arry[b] = N;
				 a++;
				 b--;
			 }
		 }
		 for(int i=0; i < arry.length; i++)
		 {
			 System.out.print(arry[i]+" ");
		 }
	}
}