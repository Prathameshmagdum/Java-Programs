public class SumOfArray 
{
	public static void main(String args[])
	{
		int a[] = {5,6,7,8,9};
		int sum = 0;
		
		/*for(int i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("The sum of array elements: "+sum);*/
		
		//Enhanced for loop - no nneed to initialization,condition and icrementation these are advantages.(Foreach loop)
		
		for(int value:a)
		{
			sum = sum + value;
		}
		System.out.println("The Sum of array elements: "+sum`	);
		
	}
}