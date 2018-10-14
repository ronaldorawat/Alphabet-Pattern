package AlphabetPatterns;
import java.util.Scanner;
public class B {
	public static void main(String[] args) {
		//for taking user input
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number of rows");
		int n=scn.nextInt();
		scn.close();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n/2+6;j++)
			{
				if(i==0||j==0||j==n/2+5||i==n/2||i==n-1)
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
