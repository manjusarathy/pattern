import java.io.*;
import java.util.*;
public class Patternstars
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,space;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		for(i = n; i >= 1; --i) 
		{
            for(space = 1; space <= n - i; ++space) 
            {
                System.out.print("  ");
            }
            for(j=i; j <= 2 * i - 1; ++j) 
            {
                System.out.print("* ");
            }

            for(j = 0; j < i - 1; ++j) 
            {
                System.out.print("* ");
            }
            System.out.println();
		}
	}
}