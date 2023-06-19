import java.util.Scanner;
public class SearchElementInArray//linear search
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter length of array: ");
		int num = sc.nextInt();
		
		int arr[]=new int [num];
		System.out.println("Enter array elements: ");
		
		for (int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Array elements are: ");
		for(int i=0;i<num;i++)
		{
			System.out.print(","+arr[i]);
		}
			
		System.out.println("\nEnter element to search: ");
		int search_ele=sc.nextInt();
			
			boolean flag = false;
			for(int i=0;i<arr.length;i++)
			{
				if(search_ele==arr[i])
				{
					System.out.println("The element is found at position: "+i);
					flag=true;
					break;
				}
			}
			if(flag==false)
			{
				System.out.println("The element is not present in an array.");
			}
	}
	
}