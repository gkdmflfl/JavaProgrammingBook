package Chapter6;

class PersonInfo{
	void showSleepingType(Person person) {
		person.showSleepStyle();
	}
}

public class ParameterPolyTest {
	/*
	 * Parameter 다형성 테스트
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PersonInfo pf = new PersonInfo();
		Person person = new Person();
		Employee employee = new Employee();
		Student student = new Student();
		President president = new President();
		
		pf.showSleepingType(person);
		pf.showSleepingType(employee);
		pf.showSleepingType(student);
		pf.showSleepingType(president);
	}

}
