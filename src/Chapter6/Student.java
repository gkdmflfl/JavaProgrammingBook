package Chapter6;

public class Student extends Person {
	private String schoolKind;
	private String grade;
	
	public String getSchoolKind() {
		return schoolKind;
	}
	public void setSchoolKind(String schoolKind) {
		this.schoolKind = schoolKind;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	@Override
	public void showSleepStyle() {
		// TODO Auto-generated method stub
		//super.showSleepStyle();
		System.out.println("�л����� ���� ��Ÿ���� ��Ģ���̴�.");
	}
	
	public void study() {
		System.out.println("���θ� �Ѵ�.");
	}
	
}
