import java.util.Scanner;
public class  Rarrow
{
    public static void main(String[] args)
    {
    	Scanner sc=new Scanner(System.in);
    	int i,j,n;
    	System.out.print("Enter N : ");
    	n=sc.nextInt();	 
    	for(i=0;i<n;i++)
        {
    		for(j=0;j<n;j++)
    		{
    			if(j<i)
    				System.out.print("  ");
    			else
    				System.out.print("*");
    		}
    		System.out.println();
        }            
    	for(i=2;i<=n;i++)
    	{
    		for(j=0;j<n;j++)
    		{
    			if(j<n-i)
    				System.out.print("  ");
    			else
    				System.out.print("*");
    		}
    		System.out.println();
    	}    
    }
}