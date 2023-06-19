public class Swap1
{
	public static void main (String args[])
	{
		int a=10, b= 20;
		
		System.out.println("Before swapping : "+a+"   "+b);
		
		//Logic 1 using third variable
		/*int temp=a;
			a=b;
			b=temp;*/
			
		//Logic 2	Using + and - operators
		/*a = a+b;
		b = a-b;
		a = a-b;	*/
		
		//Logic 3 Using * and / operators
		
		/*a = a*b;
		b = a/b;
		a = a/b;*/
		
		//Logic 4 using bitwise XOR operation
		
		/*a = a^b;
		b = a^b;
		a = a^b;*/
		
		// Logic 5 Single Statement
		
		b= a+b - (a=b);
		
		
		System.out.println("After Swapping :"+a+"   "+b);	
	}
	
}
