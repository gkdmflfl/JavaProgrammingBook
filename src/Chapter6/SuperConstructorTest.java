package Chapter6;

class Sawon2{
	String name;
	String dept;
	int salary;
	
	
	public Sawon2(String name, String dept, int salary) {
		super();
		this.name = name;
		this.dept = dept;
		this.salary = salary;
	}
	
	
	String displayInfo() {
		return "�̸� : " + name + ", �μ� : " + dept + ", ���� : " + salary;
	}
	
}

class Sales2 extends Sawon2 {
	int commition;

	public Sales2(String name, String dept, int salaly, int commition) {
		super(name, dept, salaly);
		this.commition = commition;
	}
	
	String displayInfo() {
		return super.displayInfo() + ", ���� : " + commition;
	}
	
	
}

public class SuperConstructorTest {
	/*
	 * super() �׽�Ʈ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sales2 sales2 = new Sales2("������", "������", 100000000, 70000000);
		System.out.println(sales2.displayInfo());
	}

}
