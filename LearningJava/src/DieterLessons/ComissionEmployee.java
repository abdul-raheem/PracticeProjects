package DieterLessons;

public class ComissionEmployee 
{
	protected String firstName;
	protected String lastName;
	protected String social;
	protected double grossSales;
	protected double comissionRate;
	
	public ComissionEmployee(String first, String last, String ssn,double sales,double rate)
	{
		firstName = first;
		lastName = last;
		social = ssn;
		setGrossSales(sales);
		setComissionRate(rate);
		System.out.println("ParentClass:\n");
	}
	
	public void setFirstName(String first)
	{
		firstName = first;
	}
	
	public String getFirstName()
	{
		return firstName;
	}
	
	public void setLastName(String last)
	{
		lastName = last;
		
	}
	
	public String getLastName()
	{
		return lastName;
	}

	public void setSocial(String ssn)
	{
		social = ssn;
	}
	
	public String getSocial()
	{
		return social;
	}
	
	public void setGrossSales(double sales)
	{
		grossSales = (sales < 0.0) ? 0.0 : sales;
	}
	
	public double getGrossSales()
	{
		return grossSales;
	}
	
	public void setComissionRate(double rate)
	{
		comissionRate = (rate > 0.0 && rate < 1) ? rate :0.0;
	}
	
	public double getComissionRate()
	{
		return comissionRate;
		
	}
	
	public double earning()
	{
		return comissionRate * grossSales;
	}
	
	public String toString()
	{
		return String.format("%s:%s %s \n%s: %s\n%s: %.2f\n%s: %.2f","comission employee",firstName,lastName,"social security number",social,"gross sales", grossSales,"comission rate",comissionRate);
	}
}
