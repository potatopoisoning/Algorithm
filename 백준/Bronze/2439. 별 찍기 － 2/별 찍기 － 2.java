import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) 
		{
			for(int j = T; j > i; j--)
			{
				System.out.print(" ");
			}
			for(int k = 1; k < i; k++)
			{
				System.out.print("*");
			}
			System.out.println("*");
		}
		br.close();
	}
}