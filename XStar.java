import java.util.Scanner;
public class XStar
{
    public static void main(String[] args)
    {             
    	Scanner sc=new Scanner(System.in);
    	System.out.print("Enter N : ");
    	int n=sc.nextInt();	 
        System.out.print("Enter Symbol : ");
        char c = sc.next().charAt(0);
        int k=n*2-1,i,j;
        for(i=1;i<=k;i++)
        {
        	for(j=1;j<=k;j++)
        	{      
        		if(j==i || j==k-i+1)
                System.out.print(c);
                System.out.print(" ");
        	}	 
        	System.out.println();
        }
    }
}