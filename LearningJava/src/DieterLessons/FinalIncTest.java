package DieterLessons;

public class FinalIncTest {
	
	public static void main(String args[])
	{
		FinalInc value = new FinalInc(5);
		
		System.out.println(value);
		
		for (int i = 1; i <=3 ; i++)
		{
			value.addInc();
			System.out.println(value);
		}
	}
}
