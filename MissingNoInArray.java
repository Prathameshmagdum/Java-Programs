/*public class MissingNoInArray
{
	public static void main(String args[])
	{
		int a[]={1,2,3,4,5,7,8,9,10};
		int sum1=0;
		
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("The sum of array elements: "+sum1);
		
		int sum2 =0;
		for(int i=1;i<=10;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("The sum of range of elements : "+sum2);
		
		System.out.println("The missing elements will be : "+(sum2-sum1));
	}
}*/
import java.util.Scanner;
public class MissingNoInArray {
   public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Enter how long array you want: ");
	int n = sc.nextInt();
	int arr[]=new int[50];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	System.out.println("Arry elements are:  ");
	for(int i=0;i<n;i++)
	{
		System.out.println(" "+arr[i]);
	}
	int diff = arr[1]-arr[0];
	System.out.println("the diff is: "+diff);
      //int[] arr = {10, 20, 30, 40, 60, 70, 80};
      int expectedNum = arr[0];
      int missingNum = 0;
      for(int i = 0; i < arr.length; i++) 
	{
         if(arr[i] == expectedNum) 
	   {
            expectedNum += diff;
         }
         else 
	   {
            missingNum = expectedNum;
            break;
         }
      }
      System.out.println("The missing number in the array is: " + missingNum);
   }
}
