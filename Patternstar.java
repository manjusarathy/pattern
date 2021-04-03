import java.io.*;
import java.util.*;
public class Patternstar
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}