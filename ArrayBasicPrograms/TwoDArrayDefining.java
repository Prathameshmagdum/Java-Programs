import java.util.Scanner;

public class TwoDArrayDefining
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the what by array you want: ");
		int n=sc.nextInt();
		int m=sc.nextInt();
		System.out.println(n+" x "+m);
		
		int[][] arr= new int[n][m];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[0].length;j++)
			{
				arr[i][j]=sc.nextInt();
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}