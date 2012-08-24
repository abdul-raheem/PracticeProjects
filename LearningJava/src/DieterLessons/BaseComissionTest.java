package DieterLessons;

public class BaseComissionTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BaseComission emp = new BaseComission("Bob","Lewis","333-333",-5000,.04,300);
		ComissionEmployee emp2 = emp;
		System.out.println(emp2);

	}

}
