package DieterLessons;

public class BaseComissionEmp extends ComissionEmp 
{
	private double baseSalary;
	
	public BaseComissionEmp(String first,String last,String ssn,double sales,double rate,double salary)
	{
		super(first,last,ssn,sales,rate);
		baseSalary = salary;
		
	}
	
	public double earnings()
	{
		return baseSalary + super.earnings();
	}
	
	public String check()
	{
		return "This is SubClass";
	}
	
	public String toString()
	{
		return String.format("%s %s; %s: $%,.2f","base-salaried",super.toString(),"base-salary",baseSalary);
	}

}
