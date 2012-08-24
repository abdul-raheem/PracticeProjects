package DieterLessons;

public class FinalInc {

	private int total = 0;
	private  int inc;
	
	public FinalInc(int increment)
	{
		inc = increment;
	}
	
	public void addInc()
	{
		total += inc;
	}
	
	public String toString()
	{
		return String.format("total = %d",total);
	}
}
