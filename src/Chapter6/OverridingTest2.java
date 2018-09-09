package Chapter6;

public class OverridingTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		Person person = employee;				//UpCasting
		
		System.out.println("employee.x = " + employee.x);
		System.out.println("person.x = " + person.x);
		
		
		//둘 다 7시간을 잔다가 뜲 이유는 책 223p
		employee.sleep();
		person.sleep();
	}

}
