package Chapter6;

public class Employee extends Person {
	private String department;
	int x = 20;

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public void sleep() {
		System.out.println("�������� �Ϲ������� 7�ð��� �ܴ�.");
	}
	
	@Override
	public void showSleepStyle() {
		// TODO Auto-generated method stub
		//super.showSleepStyle();
		System.out.println("�������� �Ͽ� �i�� ������ �����ϴ�.");
	}
	
}
