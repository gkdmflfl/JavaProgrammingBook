package Chapter6;

public class President extends Person {
	private int salary;
	private String nation;
	
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getNation() {
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	@Override
	public void showSleepStyle() {
		// TODO Auto-generated method stub
		//super.showSleepStyle();
		System.out.println("대통령은 항상 수면 시간이 부족하다.");
	}

}
