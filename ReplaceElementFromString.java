import java.util.Scanner;
public class ReplaceElementFromString
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner (System.in);

		System.out.println("Enter a String: ");
		String str= sc.nextLine();

		System.out.println("Enter a element to remove from above string: ");
		char element= sc.next().charAt(0);
		//sc.nextLine();
		
		String newstr= "";
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)==element)
			{
				newstr+="$";
			}
			else
			{
				newstr+=str.charAt(i);
			}
		}
		System.out.println("The new string "+newstr+" after replacing "+element+" from "+str);
	}
}