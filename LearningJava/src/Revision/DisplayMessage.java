package Revision;
import java.util.Scanner;

public class DisplayMessage {
	
	private String name;
	private int pass=0;
	private int fail=0;
	
	public  DisplayMessage(String xyz)
	{
		name = xyz;
	}
	
/*	public void setName(String xyz)
	{
		name = xyz;
		
	}**/
	
	public String getName()
	{
		return name;
	}
	
	public void calculations()
	{
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		for (int i=0;i<10;i++)
		{
			System.out.printf("Enter marks for Students in your Class %d\n",i);
			int inputmarks = input.nextInt();
			analysis(inputmarks);
			total = total + inputmarks;
		}
		
	System.out.printf("%s , you class's average is: %d  ",getName(), total/10);
	System.out.printf(" \n %d has passed and %d has failed", pass,fail);
		
	}
	public void displayMessage()
	{
		System.out.printf(" This are the marks for the class being taught by : %s",getName());
	}
	
	public void analysis(int marks)
	{
		if (marks >= 40)
		{
			pass = pass+1;
		}
		else
			fail = fail+1;
	}
}
