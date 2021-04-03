import java.io.*;
import java.util.*;
public class PascalTri
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n,coef=0,i,j,space;
		System.out.print("Enter n : ");
		n = sc.nextInt();
		for(i=0;i<n;i++)
		{
			for(space=1;space<n-i;space++)
			{
				System.out.print(" ");
			}
			for(j=0;j<=i;j++)
			{
				if((j == 0) || (i==0))
					coef = 1;
				else
					coef = coef * (i-j+1)/j;
				System.out.print(coef+" ");
			}
			System.out.println();
		}
	}
}