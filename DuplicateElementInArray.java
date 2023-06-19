import java.util.HashSet;
public class DuplicateElementInArray
{
	public static void main(String args[])
	{
		String arr[]={"avi","madhav","parth","praju","Bhokantikli","ana"};
//Logic1		
		/*boolean flag = false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Element : "+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("The Duplicate element is not found");
		}*/
		
//Logic2

		HashSet <String> hs = new HashSet();
		boolean flag = false;
		for(String l :arr)
		{
			if(hs.add(l)==false)
			{
				System.out.println("Found Duplicate Element : "+l);
				flag=true;
			}
		}
		
		if(flag==false)
		{
			System.out.println("NOT Found any duplicate element");
		}
			
	}
}