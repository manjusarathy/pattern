import java.util.Scanner;
public class Patternstarsnew
{
    public static void main(String[] args)
    {
    	int i,j,n;
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter N : ");
    	n=sc.nextInt();	 
    	for(i=n;i>=1;i--)
    	{
    		for(j=0;j<n-i;j++)
    		{
    			System.out.print(" ");
    		}
            for(j=0;j<i;j++)
            {
            	System.out.print("*");
            }
           System.out.println();
    	}             
    }
}