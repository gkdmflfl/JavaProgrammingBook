package Chapter6;

public class CastingTest {
	/*
	 * Casting �׽�Ʈ	
	 */
	public static void main(String[] args) {
		
		President president1 = new President();
		
		//president1��ü�� ���� Ŭ������ Person Ŭ���� ���۷��� ������ ������Ŵ
		//president ��ü�� �ڵ����� Person Ÿ������ UpCasting �Ǹ鼭 ������
		Person person1 = president1;
		
		//person1 ���䷯�� ������ ���� ���� President Ÿ���� ���۷��� ������ �Ҵ���
		//�θ� Ŭ���� Ÿ���� ���� ���� �ڽ� Ŭ���� Ÿ���� ���� ������ �Ҵ��ϹǷ� ����� ĳ����
		President president2 = (President)person1;
		
		//Person ��ü ����
		Person person2 = new Person();
		//Person person2 = new President();			//�̰� ��� ���ָ� ĳ���� ���� �ȶ�
		
		//Person ��ü�� President Ÿ���� ���۷��� ������ ������Ŵ
		try {
			President president3 = (President)person2;			//������ ������ �߻����� ������ ��Ÿ�ӽ� ���� �߻�
		}catch(Exception e){
			System.out.println("�ڽ� Ŭ������ ���۷��� ������ �θ� Ŭ���� Ÿ���� ��ü�� ������ �� ����.");
			e.printStackTrace();								//ClassCastException
		}
		//���� �θ� Ŭ������ ��ӹ޴� Ŭ���� Ÿ�Գ��� ĳ����
		//Student student = (Student)president2;
	}

}
