package Chapter6;

public class InstanceOfTest {

	/*
	 * instanceof ������ �׽�Ʈ
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		President president1 = new President();
		
		//UpCasting
		//Person person1 = new President();�� ����
		Person person1 = president1;
		
		if(person1 instanceof President) {
			President president2 = (President)person1;		//�ڼ� <- ����	DownCasting
			System.out.println("person1�� President Ÿ������ ĳ���� ����");
		}
		else {
			System.out.println("person1�� ĳ���� �� �� ����");
		}
		//Person ��ü ����
		Person person2 = new Person();
		
		//Person ��ü�� President Ÿ���� ���۷��� ������ ������Ŵ
		if(person2 instanceof President) {
			President president3 = (President)person2;
			System.out.println("person2�� President Ÿ������ ĳ���� ����");
		}
		else {
			System.out.println("person2�� ĳ���� �� �� ����.");			
		}
		
		
		
	}

}
