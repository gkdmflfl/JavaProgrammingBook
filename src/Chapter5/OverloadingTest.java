package Chapter5;

class Boiler {
	String maker;
	int temp;
	String color;
	
	void tempUp(){
		temp++;
	}
	void tempUp(int amount){
		temp += amount;
	}
}

public class OverloadingTest {

	public static void main(String[] args) {
		Boiler bo = new Boiler();
		System.out.println("����µ� : " + bo.temp);
		bo.tempUp();
		System.out.println("bo.tempUp() �޼ҵ� ȣ�� �� ���� �µ� : " + bo.temp);
		bo.tempUp(20);
		System.out.println("bo.tempUp(20) �޼ҵ� ȣ�� �� ���� �µ� : " + bo.temp);

	}

}
