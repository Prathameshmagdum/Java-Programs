import java.util.Scanner;
public class calculator
{
	public static void main (String args [])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1= sc.nextInt();
		
		System.out.println("Enter two number: ");
		int num2= sc.nextInt();
		
		int Choice=0;
		System.out.println("Choodse which opertion you have to do it:\n1.Addition\n2.Subtraction\n3.multiplication\n4.Division\n");
		Choice=sc.nextInt();
		
		switch(Choice)
		{
			case 1:
				int result=num1+num2;
				System.out.println("The result will be for "+num1+" + "+num2+" = "+result);
				break;
			case 2:
				result=num1-num2;
				System.out.println("The result will be for "+num1+" - "+num2+" = "+result);
				break;
			case 3:
				result=num1*num2;
				System.out.println("The result will be for "+num1+" * "+num2+" = "+result);
				break;
			case 4:
				result=num1/num2;
				System.out.println("The result will be for "+num1+" / "+num2+" = "+result);
				break;
		}
		
		
	}
}

