
import java.util.Scanner;

public class Z {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the odd number of rows");
		int n=scn.nextInt();
		scn.close();
		
		for(int i=0;i<=n;i++)
		{	
			for(int j=0;j<=n;j++)
			{
				if(i==0||i+j==n||i==n)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
	}
	
}
