import java.util.Scanner;

public class ReverseNum
{
	public static void main (String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		//Logic 1
		/*int rev=0;
		while(num!=0)
		{
			rev= rev*10 + num%10;
			num = num/10;
		}*/
		
		//Logic 2 using String buffer class
		
/*		StringBuffer sb = new StringBuffer (String.valueOf(num));
		StringBuffer rev = sb.reverse();
		System.out.println("Entered Number after reversing will be : "+rev);*/
		
		//Logic 3
		
		StringBuilder sbl = new StringBuilder ();
		
		sbl.append(num);
		
		StringBuilder rev = sbl.reverse();
		
		System.out.println("Entered Number after reversing will be : "+rev);
	}
}