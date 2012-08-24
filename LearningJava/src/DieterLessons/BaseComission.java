package DieterLessons;

public class BaseComission extends ComissionEmployee
{
	private double basesalary;
	
	public BaseComission(String first, String last, String ssn, double sales, double rate, double salary)
	{
		super(first,last,ssn,sales,rate);
		basesalary = salary;
		System.out.println(this);
	}
	
public String toString()
	{
		return String.format("%s %s\n%s: %.2f","base-salaried",super.toString(),"basesalary",basesalary);
	}

}
