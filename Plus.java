import java.util.Scanner;
public class Plus
{
	public static void main(String[] args)
    {
		Scanner sc=new Scanner(System.in);
		int i=1,j,n;
		System.out.print("Enter N : ");
		n=sc.nextInt();	 
		do
        {
			if(i!=n)
	        {
				j=1;
				do
                {      
					if(j==n)
						System.out.print("+");
					System.out.print(" ");
					j++ ;
                }while(j<=n);
	        }
			else
			{
				j=1;
				do 
				{
					System.out.print("+");
					j++;
				}while(j<=n*2-1);
			}
			System.out.println();
			i++; 
        } while(i<=n*2-1);           
    }
} 