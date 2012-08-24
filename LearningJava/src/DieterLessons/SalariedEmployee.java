package DieterLessons;

public class SalariedEmployee extends Employee 
{
	private double weeklySalary;
	
	public SalariedEmployee(String first,String last,String ssn,double salary)
	{
		super(first,last,ssn);
		weeklySalary = salary;
	}
	
	public double earnings()
	{
		return weeklySalary;
	}
	
	public String toString()
	{
		return String.format("salaried employee: %s\n%s: $%,.2f",super.toString(),"weekly salary",weeklySalary);
	}

}
