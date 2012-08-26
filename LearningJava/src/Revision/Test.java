package Revision;
import java.util.Scanner;
public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
			
			Scanner input = new Scanner(System.in);
			System.out.println("Enter your name:");
			String name = input.nextLine();
			DisplayMessage text = new DisplayMessage(name);
		// text.setName(name);
			//text.displayMessage();
			text.calculations();
			/**DisplayMessage text2;
			text2 = text;
			text2.displayMessage("text2display");**/
		

	}

}
