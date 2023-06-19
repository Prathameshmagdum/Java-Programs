public class OccurenceOfChar
{
	public static void main(String []args)
	{
		String str="prathamesh magdum";
		
		int cnt=0;
		
		char c = 'a'; 
		
		int count = countchar(str,c);
		System.out.println("The occuence of element is: "+count);
		
	}
	
	public static int countchar(String str,char c)
	{
		int count=0;
		int pos=0;
		
		char [] ch = str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!=c)
			{
				ch[pos++]=ch[i];
			}
			else
			{
				count++;
			}
		}
		return count;
	}
}