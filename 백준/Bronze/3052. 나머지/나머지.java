import java.util.*;

public class Main
{
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 
		 int cnt = 0;
		 int[] arry = new int[10];
		 boolean bl;
		 
		 for(int i = 0; i < arry.length; i++)
		 {
			 arry[i] = sc.nextInt() % 42; 
		 }
		 
		 for(int i = 0; i < arry.length; i++)
		 {
			 bl = false;
			 
			 for(int j = i + 1; j < arry.length; j++)
			 {
				 if(arry[i] == arry[j])
				 {
					 bl = true;
					 break;
				 }
			 } 
			 if(bl == false)
			 {
				 cnt++;
			 }
		 }
		 System.out.println(cnt);
	}
}
