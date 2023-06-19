public class MinAndMaxInAraay
{
	public static void main (String args[])
	{
		int a[]={50,20,60,80,30,10,100};
		
		int max=a[0];
		
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("The maximum element in an array is : "+max);
		
		int min= a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
		System.out.println("The minimum element in an array is : "+min);
	}
}