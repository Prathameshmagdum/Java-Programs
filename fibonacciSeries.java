import java.util.Scanner;
public class fibonacciSeries
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("How Long Fibonacci series you want: ");
		int num=sc.nextInt();
		System.out.println("Enter first number : ");
		int n1 = sc.nextInt();
		System.out.println("Enter Second Number : ");
		int n2 = sc.nextInt();
		
		int sum =0;
		System.out.println("The fibonacci series is: ");
		System.out.print(n1+" "+n2);
		
		for(int i=2;i<num;i++)
		{
			sum = n1 + n2 ;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
		
	}
}
//Recursion method-------------------->

/*public class FibonacciSeries {
  public static int FibonacciSeries(int n) {
    if (n <= 1) {
      return n;
    } else {
      return FibonacciSeries(n-1) + FibonacciSeries(n-2);
    }
  }

  public static void main(String[] args) {
    int number = 10;
    System.out.print("Fibonacci series up to " + number + " terms: ");
    for (int i = 0; i < number; i++) {
      System.out.print(FibonacciSeries(i) + " ");
    }
  }
}
*/