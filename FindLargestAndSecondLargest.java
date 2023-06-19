public class FindLargestAndSecondLargest
{
	public static void main (String args[])
	{
		int arr[]={1,2,50,60,20,90,80,10,15};
		int largest=arr[0];
		int sec_larg=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>largest)
			{
				sec_larg=largest;
				largest=arr[i];
			}
			else if(arr[i]>sec_larg)
			{
				sec_larg=arr[i];
			}
		}
		System.out.println("The largest element will be: "+largest);
		System.out.println("The second largest element will be: "+sec_larg);
	}
}