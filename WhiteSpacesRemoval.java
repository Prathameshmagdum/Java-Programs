public class WhiteSpacesRemoval
{
	public static void main(String args[])
	{
		String str = "Pra thamesh  Balu M a g dum";
		System.out.println(str);
		char [] chars= str.toCharArray();
		String nstr ="";
		for(int i=0;i<chars.length;i++)
		{
			if(chars[i]!=' ')
			{
				nstr+=chars[i];
			}
		}
		System.out.println("The new String will be: "+nstr);
	}
}