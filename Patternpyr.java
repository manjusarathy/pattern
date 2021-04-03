import java.io.*;
import java.util.*;
public class Patternpyr
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,i,j,space,k=0;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		for(i = 1; i <= n; ++i, k = 0) 
		{
            for(space = 1; space <= n - i; ++space) 
            {
                System.out.print("  ");
            }
            while(k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }

            System.out.println();
        }
    }
}