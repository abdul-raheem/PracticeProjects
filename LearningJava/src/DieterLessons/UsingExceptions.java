package DieterLessons;

public class UsingExceptions 
{
	public static void main(String[] args) 
	{
		try 
		{
			throwException();
			System.out.println("Method Main");
			   
		}
		catch(Exception exception)
		{
			System.out.println("Exception Handled in Main");
			StackTraceElement[] element = exception.getStackTrace();
		}
		
		noException();
	}

	public static void throwException()
	throws Exception
	{
		try
		{
			System.out.println("Method ThrowException");
			throw new Exception();
		}
		catch(Exception excep)
		{
			System.out.println("Exception handled in method throwExceptino");
			throw excep;
		}
		finally
		{
			System.out.println("Finally executed in throException");
		}
		
//		System.out.println("End of method noExcepion");
	}
	
	public static void noException()
	{
		try
		{
			System.out.println("Method noException");
//			throw new Exception();
		}
		catch(Exception excep)
		{
			System.out.println(excep);
		}
		finally
		{
			System.out.println("Finally executed in noExeption");
		}
		System.out.println("End of method noExcepion");
	}
}
