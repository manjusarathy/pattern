import java.io.*;
import java.util.*;
public class Patternstr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		for(i=n-1;i>=0;i--)
		{
			for(j=0;j<=i;j++)
				System.out.print("* ");
			System.out.println();
		}
	}
}