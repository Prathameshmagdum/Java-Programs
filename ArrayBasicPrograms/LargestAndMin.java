public class LargestAndMin
{
	public static void main (String args[])
	{
		int arr[]= {1,59,26,7,28,100,2,1000};
		
		int maxnum=arr[0];
		int minnum=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(maxnum<arr[i])
			{
				maxnum=arr[i];
			}
			else if(minnum>arr[i])
			{
				minnum=arr[i];
			}
		}
		System.out.println("Largest= "+maxnum+"---minimum= "+minnum);
	}
}