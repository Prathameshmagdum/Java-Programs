import java.util.Scanner;
public class Palindrome
{
	public static void  main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		int num;
		do{
			
		System.out.println("Enter a number : ");
		num = sc.nextInt();
		
		if(num!=0)
		{
			int original_num = num;
			int rev=0;
			
			while(num!=0)
			{
				rev=rev*10 + num%10;
				num = num / 10;
			}
		
			if(original_num==rev)
			{
				System.out.println(original_num+" The entered number is palindrome number.");
			}
			else
				System.out.println(original_num+" The number is not palindrome");
			
		}
		
		
		}while(num!=0);
		
	}
}