public class BinarySearch
{
	public static void main(String args[])
	{
		boolean flag = false;
		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int key = 6;
		
		int l=0;
		int h=arr.length-1;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			if(arr[m]==key)
			{
				System.out.println("The element is found");
				flag=true;
				break;
			}
			
			if(key>arr[m])
			{
				l=m+1;
			}
			
			if(key<arr[m])
			{
				h=m-1;
			}
			
		}
		if(flag==false)
		{
			System.out.println("Element is not found");
		}
	}	
}