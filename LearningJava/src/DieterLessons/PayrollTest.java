package DieterLessons;

public class PayrollTest {

	
	public static void main(String[] args) 
	{
		Employee empl[] = new Employee[3];
		SalariedEmployee salariedemp = new SalariedEmployee("Shane","Smith","111-11-111",800.00);
		ComissionEmp comissionEmp = new ComissionEmp("John","Smith","111-11-111",800.00,0.6);
		BaseComissionEmp baseCommemp = new BaseComissionEmp("Mike","Smith","111-11-111",800.00,0.6,300);
		empl[0]= salariedemp;
		empl[1]= comissionEmp;
		empl[2]= baseCommemp;
		ComissionEmp comissio;
		comissio =  baseCommemp;
		System.out.println( ((BaseComissionEmp) comissio).check());
		System.out.println(baseCommemp.earnings());
		
		for (Employee emp : empl)
		{
			
			
			if (emp instanceof BaseComissionEmp)
			{
				BaseComissionEmp newemp =  (BaseComissionEmp) emp;
				double oldsalary = newemp.earnings()*1.10;
				System.out.printf("Earned $%,.2f\n\n", oldsalary);
				System.out.println(emp);
			}
		}

	}

}
