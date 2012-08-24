package DieterLessons;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DiveZeroNoException {

	public static int quotient(int num, int den)
	throws ArithmeticException,InputMismatchException
	{
		return num/den;
	}
	
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		boolean check = true;
		do
		{
			try
			{
				System.out.println("Enter first Number");
				int num = scan.nextInt();
				System.out.println("Enter second Number");
				int den = scan.nextInt();
				System.out.printf("\nResult: %d / %d = %d\n",num,den,num/den);
//						quotient(num,den));
				check = false;
			}
			catch(InputMismatchException inputMismatchException)
			{
//				scan.nextLine();
				System.out.printf("\n Excepiton: %s\n", inputMismatchException);
				scan.nextLine();
				System.out.println("Please Enter Integer, Try again");
				
			}
			catch(ArithmeticException ar)
			{
				System.err.printf("\n Excepiton: %s\n", ar);
				scan.nextLine();
				System.out.println("No Zeroes, Try again");
			}
			
		}while(check);
		

	}

}
