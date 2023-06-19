import java.util.Scanner;
public class CountEvenOdd
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter number: ");
		
		int num = sc.nextInt();
		
		int even_cnt=0;
		int odd_cnt=0;
		
		while(num>0)
		{
			int rem=num%10;
			
			if(rem%2==0)
			{
				even_cnt++;
			}
			else
			{
				odd_cnt++;
			}
			
			num=num/10;
		}
		
		System.out.println("Count of even number : "+even_cnt);
		System.out.println("Count of odd number : "+odd_cnt);
	}
}