import java.io.*;
import java.util.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		
		int T = Integer.parseInt(br.readLine());
		String str = "";
		
		for (int i = 1; i <= T; i++) 
		{
			str += "*";
			System.out.println(str);
		}
		br.close();
	}
}