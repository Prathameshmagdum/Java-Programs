import java.util.Arrays;
public class BubbleSort
{
	public static void main (String args[])
	{
		int a[]={5,1,3,9,4};
		
		int len= a.length;
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp = a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println("The sorted array are: "+Arrays.toString(a));
		
	}
}